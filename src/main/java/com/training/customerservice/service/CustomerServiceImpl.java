package com.training.customerservice.service;

import java.util.Optional;
import java.util.UUID;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.customerservice.dto.LoginRequest;
import com.training.customerservice.exception.InvalidCustomerException;
import com.training.customerservice.model.Customer;
import com.training.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Override
	public Customer addCustomer(Customer customer) {
		String encryptedPassword = passwordEncoder.encode(customer.getPassword());
	    customer.setPassword(encryptedPassword);
		if(customer.getName().equals("")) {
			throw new InvalidCustomerException("Customer information missing");
		}
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(UUID id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Customer updateCustomer(Customer customer, UUID id) {
		 Customer existingCustomer = getCustomerById(id);
	        if (existingCustomer != null) {
	        	existingCustomer.setName(customer.getName());
	        	existingCustomer.setEmail(customer.getEmail());
	        	existingCustomer.setPhone(customer.getPhone());
	        	existingCustomer.setAddress(customer.getAddress());
	            return repository.save(existingCustomer);
	        }
	        return null;
	}

	@Override
	public Customer getByEmail(LoginRequest request) {
		Optional<Customer> customerOpt = repository.findByEmail(request.getEmail());

	    if (customerOpt.isPresent()) {
	        Customer customer = customerOpt.get();
	        if (passwordEncoder.matches(request.getPassword(), customer.getPassword())) {
	            return customer;
	        } else {
	            return null;
	        }
	    } else {
	        return null;
	    }
	}

}

package com.training.customerservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.customerservice.model.Customer;
import com.training.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer addCustomer(Customer customer) {
		
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

}

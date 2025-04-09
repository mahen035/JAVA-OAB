package com.training.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.customerservice.intercomm.AccountClient;
import com.training.customerservice.model.Customer;
import com.training.customerservice.service.CustomerService;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

	 @Autowired
	 private CustomerService service;
	 
	 @Autowired
	 private AccountClient accountClient;

	 @PostMapping
	 public Customer create(@RequestBody Customer customer, @RequestParam Double balance, @RequestParam String accountType) {
		Customer newCustomer = service.addCustomer(customer); 
		accountClient.addAccount(newCustomer.getId(), balance, accountType);
		return newCustomer;
	  }
}

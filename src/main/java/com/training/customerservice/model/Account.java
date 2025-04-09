package com.training.customerservice.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Account {
	 	
	    private UUID id;
	    private UUID customerId;
	    private Double balance;
	    private String accountType;
	    
	    public Account(UUID customerId, Double balance, String accountType) {
	    	this.customerId=customerId;
	    	this.balance=balance;
	    	this.accountType=accountType;
	    }
	    public Account() {
	    	
	    }
}


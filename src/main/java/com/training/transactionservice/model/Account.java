package com.training.transactionservice.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
	 	@Id 
	 	@GeneratedValue
	    private UUID id;
	 	@Column(nullable=false)
	    private UUID customerId;
	 	@Column(nullable=false)
	    private Double balance;
	 	@Column(nullable=false)
	    private String accountType;
	 	
	 	public Account(UUID customerId, Double balance, String accountType) {
	 		this.customerId = customerId;
	 		this.balance = balance;
	 		this.accountType = accountType;
	 	}
	 	public Account() {
	 		
	 	}
}

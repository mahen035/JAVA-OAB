package com.training.transactionservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.transactionservice.model.Account;
import com.training.transactionservice.service.TransactionService;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService txnService;
	
	@PostMapping("/account")
	public Account addCount(@RequestBody UUID customerId, @RequestParam Double balance, @RequestParam String accountType) {
		return txnService.addAccount(customerId, balance, accountType);
	}

}

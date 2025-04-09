package com.training.transactionservice.service;

import java.util.List;
import java.util.UUID;

import com.training.transactionservice.model.Account;
import com.training.transactionservice.model.Transaction;

public interface TransactionService {
	
	public Transaction deposit(Transaction transaction, UUID accountId, Double amount);
	public Transaction withdraw(UUID accountId, Double amount);
	public Transaction transfer(UUID fromId, UUID toId, Double amount);
	public List<Transaction> getTransactions(UUID accountId);
	public Account addAccount(UUID customerId, Double balance, String accountType);
	 

}

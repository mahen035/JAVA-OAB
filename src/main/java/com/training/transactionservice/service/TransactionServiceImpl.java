package com.training.transactionservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.transactionservice.model.Account;
import com.training.transactionservice.model.Transaction;
import com.training.transactionservice.repository.AccountRepository;
import com.training.transactionservice.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	    @Autowired
	    private AccountRepository accountRepository;
	    @Autowired
	    private TransactionRepository txnRepository;

	@Override
	public Transaction deposit(Transaction transaction, UUID accountId, Double amount) {
		Account account = accountRepository.findById(accountId).orElseThrow();
		account.setBalance(account.getBalance() + amount);
        accountRepository.save(account);
        return txnRepository.save(transaction);
	}

	@Override
	public Transaction withdraw(UUID accountId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction transfer(UUID fromId, UUID toId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getTransactions(UUID accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account addAccount(UUID customerId, Double balance, String accountType) {
		
		Account newAccount =  accountRepository.save(new Account(customerId, balance, accountType));
		return newAccount;
	}

}

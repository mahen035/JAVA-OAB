package com.training.transactionservice.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transactionservice.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
	List<Transaction> findByAccountId(UUID accountId);

}

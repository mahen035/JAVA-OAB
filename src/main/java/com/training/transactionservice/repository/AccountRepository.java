package com.training.transactionservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.transactionservice.model.Account;

public interface AccountRepository extends JpaRepository<Account, UUID>{

}

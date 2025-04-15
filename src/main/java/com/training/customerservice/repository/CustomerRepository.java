package com.training.customerservice.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID>{
	Optional<Customer> findByEmail(String email);

}

package com.training.transactionservice.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaction {

	@Id 
	@GeneratedValue
    private UUID id;
	@Column(nullable=false)
    private UUID accountId;
	@Column(nullable=false)
    private String type;
	@Column(nullable=false)
    private Double amount;
	@Column(nullable=false)
    private LocalDateTime timestamp;
}

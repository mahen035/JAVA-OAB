package com.training.customerservice.intercomm;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.customerservice.model.Account;

@FeignClient(name = "transaction-service", url="http://localhost:8082/api/v1/transaction")
public interface AccountClient {
	@PostMapping("/account")
	Account addAccount(UUID customerID, @RequestParam Double balance, @RequestParam String accountType);
}

package com.tsc.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsc.accounts.entity.AccountEntity;
import com.tsc.accounts.entity.CustomerEntity;
import com.tsc.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	@PostMapping("/myAccount")
	public AccountEntity getAccountDetails(@RequestBody CustomerEntity customer) {

		AccountEntity accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}

	}
	

}

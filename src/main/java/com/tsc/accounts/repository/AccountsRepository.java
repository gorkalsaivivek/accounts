package com.tsc.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsc.accounts.entity.AccountEntity;

public interface AccountsRepository extends JpaRepository<AccountEntity, Long> {
	
	AccountEntity findByCustomerId(int customerId);

}

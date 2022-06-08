package com.bank.abcmanage.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
//	Optional<BankAccount> setaBalance(int amount);
//	
//	Optional<BankAccount> findByBankAccountId(int aId);
//	
//	Optional<BankAccount> deleteByBankAccountId(int aId);
}

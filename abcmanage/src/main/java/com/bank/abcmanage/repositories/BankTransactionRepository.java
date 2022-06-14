package com.bank.abcmanage.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankTransaction;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Integer> {
//	Optional<BankTransaction> findByBankTransactionId(int tId);
//	
//	Optional<BankTransaction> deleteByBankTransactionId(int tId);
}

package com.bank.abcmanage.repositories;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankTransaction;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Integer> {
//	Optional<BankTransaction> findByBankTransactionId(int tId);
//	
//	Optional<BankTransaction> deleteByBankTransactionId(int tId);
	
	Optional<List<BankTransaction>> findByDateTime(Timestamp date_Time);
	
	List<BankTransaction> findByDateTimeBetween(Timestamp stDate,Timestamp edDate);
}

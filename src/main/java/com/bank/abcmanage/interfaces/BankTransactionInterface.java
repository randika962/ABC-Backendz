package com.bank.abcmanage.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankTransaction;


public interface BankTransactionInterface extends JpaRepository<BankTransaction, Integer> {
	
//	public List<BankTransaction> listAllBankTransaction();
//	
//	public void create(BankTransaction BankTransactionInterface);
//	
//	public BankTransaction get(Integer tid);
//	
//	public void delete(Integer tid);

}

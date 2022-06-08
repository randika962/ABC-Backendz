package com.bank.abcmanage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.BankTransaction;
import com.bank.abcmanage.repositories.BankTransactionRepository;


@Service
public class BankTransactionService {

	@Autowired
	private BankTransactionRepository tranrepo;
    
	
	public List<BankTransaction> listAllBankTransaction()
	{
		return tranrepo.findAll();
	}
	
	public void createBankTransaction(BankTransaction usertransaction)
	{
		tranrepo.save(usertransaction);
	}
	
	
	public BankTransaction getBankTransactionById(int tid)
	{
		return tranrepo.findById(tid).get();
	}
	
	public void deleteBankTransactionById(int tid)
	{
		tranrepo.deleteById(tid);
	}
	
}

package com.bank.abcmanage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.BankTransaction;
import java.sql.Timestamp;
import java.time.LocalDate;

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
	
	
	
	
	
	public List<BankTransaction> gettransactionBydate(Timestamp date_Time) {
		return tranrepo.findByDateTime(date_Time).get();
	}
	
	public List<BankTransaction> getfiltertransactionBydate(Timestamp stDate,Timestamp edDate) {
		return tranrepo.findByDateTimeBetween(stDate, edDate);
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

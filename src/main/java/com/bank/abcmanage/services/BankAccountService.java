package com.bank.abcmanage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.BankAccount;
import com.bank.abcmanage.repositories.BankAccountRepository;

@Service
public class BankAccountService {
	
	@Autowired
	private BankAccountRepository accrepo;
    
	
	public List<BankAccount> listAllBankAccount()
	{
		System.out.println("Service method called");
		return accrepo.findAll();
	}
	
	public void createBankAccount(BankAccount useraccount)
	{
		accrepo.save(useraccount);
	}
	
	public void incrementBalance(BankAccount bankaccount, float amount) {
		
		bankaccount.setaBalance(amount);
		
		accrepo.save(bankaccount);
	}
	
    public void decrementBalance(BankAccount bankaccount, float amount) {
		
		bankaccount.setaBalance(amount);
		
		accrepo.save(bankaccount);
	}
	
	public BankAccount getBankAccountById(int aid)
	{
		return accrepo.findById(aid).get();
	}
	
	public void deleteBankAccountById(int aid)
	{
		accrepo.deleteById(aid);
//		accrepo.de
	}
	
//	public BankAccount getBalance(int id) {
//		return accrepo.findById(id).get();
//	}

	
	
}

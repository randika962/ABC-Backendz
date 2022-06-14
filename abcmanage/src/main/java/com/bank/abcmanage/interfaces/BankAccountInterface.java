package com.bank.abcmanage.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankAccount;

public interface BankAccountInterface extends JpaRepository<BankAccount, Integer> {
       
// /*   public List<BankAccount> listAllBankAccount();
//	
//	public void create(BankAccount BankAccountInterface);
//	
//	public BankAccount get(Integer aid);
//	
//	public void delete(Integer aid); */
}

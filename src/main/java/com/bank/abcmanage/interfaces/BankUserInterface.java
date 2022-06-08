package com.bank.abcmanage.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankUser;

public interface BankUserInterface extends JpaRepository<BankUser, Integer> {
       
//    public List<BankUser> listAllBankUser();
//	
//	public void create(BankUser BankUserInterface);
//	
//	public BankUser get(Integer uid);
//	
//	public void delete(Integer uid);
}

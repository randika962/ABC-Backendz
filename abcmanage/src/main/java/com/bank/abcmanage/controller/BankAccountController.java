package com.bank.abcmanage.controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.abcmanage.model.BankAccount;
import com.bank.abcmanage.services.BankAccountService;

@RestController
public class BankAccountController {
	
	@Autowired
	private BankAccountService accountService;
	
	@GetMapping("/bankaccount")
	public ResponseEntity list ()
	{
		System.out.println(accountService.listAllBankAccount());
		return ResponseEntity.status(HttpStatus.OK)
				.body(accountService.listAllBankAccount());
	}
	
	@PostMapping("/createbankaccount")
	public BankAccount createBankAccount(@RequestBody BankAccount account)
	{
		
		accountService.createBankAccount(account);
		return account;
	}
	
	
	@CrossOrigin
	@GetMapping("/bankaccount/{aId}")
	public ResponseEntity<BankAccount> get(@PathVariable int aId) {
		try {
	BankAccount account = accountService.getBankAccountById(aId);
			System.out.println(account.toString());
			return ResponseEntity.status(HttpStatus.OK)
					.body(account);
		} catch (NoSuchElementException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body(null);
			
		}
	}
	
	@DeleteMapping("/bankaccountdelete/{aId}")
	public void deleteById(@PathVariable int aId)
	{
		accountService.deleteBankAccountById(aId);
//		return "Success Account Delete";
	}
}

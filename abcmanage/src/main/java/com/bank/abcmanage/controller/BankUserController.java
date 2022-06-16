package com.bank.abcmanage.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.abcmanage.model.BankResponse;
import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.services.BankPdfExporter;
import com.bank.abcmanage.services.BankUserService;
import com.lowagie.text.DocumentException;

@RestController
public class BankUserController {

	@Autowired
	private BankUserService userService;
	
	@Autowired
	private BankPdfExporter pdfService;
	
	@PostMapping("/createbankusers")
	public String createBankUser(@RequestBody BankUser user) {
		
		Optional<BankUser> u = userService.findUserByEmail(user.getUserEmail());
		if(u.isEmpty()) {
			userService.createBankUser(user);
			return "User add success";
		}else {
			return "User is added already";
		}
	}
//	public BankUser createBankUser(@RequestBody BankUser user)
//	{
//		
//		userService.createBankUser(user);
//		return user;
//	}
	
	@PutMapping("/updatebankusers/{uId}")
	public void updateBankUser(@RequestBody BankUser user, @PathVariable int uId)
	{
		System.out.println("Update user function called");
		
		   System.out.println("Update user" +user.toString());
		    System.out.println("Update user Id" +uId);
		//try {
			BankUser userExist = userService.getBankUserById(uId);
			userService.updateBankUser(user);
		//	System.out.println("Update user" +user);
			//return ResponseEntity.status(HttpStatus.OK).body(new BankRequest(userService.getBankUserById(uId),"Success", "Found"));
			//new ResponseEntity<>(HttpStatus.OK);
		//} catch(NoSuchElementException e) {
		//	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new BankRequest(null,"Unsuccess", "UnFound"));
					//new ResponseEntity<>(HttpStatus.NOT_FOUND);
		//}
		//userService.updateBankUser(user);
		//return "Succesfull Update";
	}
	
/*
	@PutMapping("/updatebankusers/{uId}")
	public ResponseEntity<?> updateBankUser(@RequestBody BankUser user, @PathVariable int uId)
	{
		    System.out.println("Update user" +user.toString());
		    System.out.println("Update user Id" +uId);
		//try {
			BankUser userExist = userService.getBankUserById(uId);
			userService.updateBankUser(user);
		//	System.out.println("Update user" +user);
			return ResponseEntity.status(HttpStatus.OK).body(new BankRequest(userService.getBankUserById(uId),"Success", "Found"));
			//new ResponseEntity<>(HttpStatus.OK);
		//} catch(NoSuchElementException e) {
		//	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new BankRequest(null,"Unsuccess", "UnFound"));
					//new ResponseEntity<>(HttpStatus.NOT_FOUND);
		//}
		//userService.updateBankUser(user);
		//return "Succesfull Update";
	}
	*/
	
	@GetMapping("/allusers")
	public List<BankUser> getAllbankUser(){
		return userService.getAllBankUser();
	}
	
	@CrossOrigin
	@GetMapping("/bankusers")
	public ResponseEntity list()
	{
		return ResponseEntity.status(HttpStatus.OK).body(new BankResponse(userService.getAllBankUser(),"Success", "Found"));
	}
	
//	@GetMapping("/bankusers")
//	public List<BankUser> getAllBankUser()
//	{
//		return userService.getAllBankUser();
//	}
	
	
	@GetMapping("/bankusers/{uId}")
	public BankUser findById(@PathVariable int uId)
	{
		return userService.getBankUserById(uId);
	}
	
	
	@DeleteMapping("/bankusersdelete/{uId}")
	public void deleteById(@PathVariable int uId)
	{
		userService.deleteBankUserById(uId);
		
	}
/*	
	@GetMapping("/bankusers/ABC Users")
	public void CreateBankPdf(HttpServletResponse response) throws DocumentException, IOException {
		
		List<BankUser> Listuser = userService.getAllBankUser();
		
		response.setContentType("application/pdf");
		pdfService.CreateBankPdf(response, Listuser);
		
	}*/
}

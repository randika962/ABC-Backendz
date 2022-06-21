package com.bank.abcmanage.controller;

import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.abcmanage.services.BankEmailSend;
import com.bank.abcmanage.services.BankUserService;
import com.bank.abcmanage.model.BankAccount;
import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.repositories.BankUserRepository2;

@RestController
public class BankForgotPasswordController {

	@Autowired
	private BankUserService uService;
	
	@Autowired
	private BankEmailSend emailsender;
	
	@GetMapping("/bankPasswordforgot")
	public String forgotPassword(@RequestParam String email) {
		Optional<BankUser> user = uService.findUserByEmail(email);
		if(user.isEmpty()) {
			return "This Bank User Can't find. Now Please check Your Email";
		
		}else {

			System.out.println("This User Not found");
			String code = String.format("%04d", new Random().nextInt(10000));
			System.out.println(code);
			emailsender.sendMail(email, "subject for 1st mail", "This is the Recovery code for "+email.toString()+": "+code.toString());
			return "Successfully" ;
		}

	}
}

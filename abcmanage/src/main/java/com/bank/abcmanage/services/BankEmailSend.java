package com.bank.abcmanage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class BankEmailSend {
	
	@Autowired
	private JavaMailSender emailSender;
	
	public void sendMail(String to,String subject,String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("srimalh@mexxar.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);
	}

}

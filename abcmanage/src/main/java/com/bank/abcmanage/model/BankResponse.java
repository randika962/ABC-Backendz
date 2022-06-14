package com.bank.abcmanage.model;

public class BankResponse<T> {
	
	 private T body;
	 private String stutus;
	 private String message;
	
	public BankResponse() {
		super();
		
	}

	public BankResponse(T body, String stutus, String message) {
		super();
		this.body = body;
		this.stutus = stutus;
		this.message = message;
	}
	
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public String getStutus() {
		return stutus;
	}
	public void setStutus(String stutus) {
		this.stutus = stutus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	 
	 
}

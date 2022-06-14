package com.bank.abcmanage.model;

/*
 * An model for data received in the authentication request
 */

import java.io.Serializable;

	public class AuthenticationRequest implements Serializable {


	    private String userEmail;
	    private String password;

	    public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    //need default constructor for JSON Parsing
	    public AuthenticationRequest()
	    {

	    }

	    public AuthenticationRequest(String username, String password) {
	        this.setUserEmail(username);
	        this.setPassword(password);
	    }
	}


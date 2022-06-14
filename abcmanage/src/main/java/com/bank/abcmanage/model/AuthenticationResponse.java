package com.bank.abcmanage.model;

/*
 * A model for the data to be sent back after authentication
 */

import java.io.Serializable;
import java.util.Optional;

import org.springframework.security.core.userdetails.User;

	public class AuthenticationResponse implements Serializable {

	    private String jwt;
	    private Optional<BankUser> user;
	    
	    
	    
		public AuthenticationResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public AuthenticationResponse(String jwt, Optional<BankUser> user) {
			super();
			this.jwt = jwt;
			this.user = user;
		}



		@Override
		public String toString() {
			return "AuthenticationResponse [jwt=" + jwt + ", user=" + user + "]";
		}
		
		public String getJwt() {
			return jwt;
		}
		public void setJwt(String jwt) {
			this.jwt = jwt;
		}
		public Optional<BankUser> getUser() {
			return user;
		}
		public void setUser(Optional<BankUser> user) {
			this.user = user;
		}
        
	    
	 

//	    public AuthenticationResponse(String jwt, User user) {
//			this.jwt = jwt;
//			this.user = user;
//		}

       //Newly Add Constructor
//		public AuthenticationResponse(String jwt2, BankUser correspondingUser) {
//			// TODO Auto-generated constructor stub
//		}
        
		

	}



package com.bank.abcmanage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bankusers")
public class BankUser {
         
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public BankUser() {
		
		
	}
	
    
	@Override
	public String toString() {
		return "BankUser [uId=" + uId + ", fName=" + fName + ", lName=" + lName + ", addres=" + addres + ", userEmail="
				+ userEmail + ", password=" + password + ", type=" + type + ", bankaccount=" + bankaccount + "]";
	}




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String fName;
	private String lName;
	private String addres;
	private String userEmail;
	private String password;
	private String type;
	
	@OneToMany(mappedBy = "owner")
	@JsonIgnoreProperties("owner")
	private List<BankAccount> bankaccount;
	
	
	
	
	public BankUser(int uId, String fName, String lName, String addres, String userEmail, String password, String type,
			List<BankAccount> bankaccount) {
		super();
		this.uId = uId;
		this.fName = fName;
		this.lName = lName;
		this.addres = addres;
		this.userEmail = userEmail;
		this.password = password;
		this.type = type;
		this.bankaccount = bankaccount;
	}
	public List<BankAccount> getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(List<BankAccount> bankaccount) {
		this.bankaccount = bankaccount;
	}
	
	


	
	
	
}

package com.bank.abcmanage.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bankaccount")
public class BankAccount {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aId;
	private String aNumber;
	private float aBalance;
	private int uId;
	
	
	@ManyToOne()
	//@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name ="uId", insertable = false, updatable = false, nullable = false, referencedColumnName = "uId")
	@JsonIgnoreProperties("bankaccount")
	private BankUser owner;
	@OneToMany(mappedBy = "sourceAccount")
//	@JsonIgnoreProperties("sourceAccount")
	private List<BankTransaction> transaction;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(int aId, String aNumber, float aBalance, int uId, BankUser owner,
			List<BankTransaction> transaction) {
		super();
		this.aId = aId;
		this.aNumber = aNumber;
		this.aBalance = aBalance;
		this.uId = uId;
		this.owner = owner;
		this.transaction = transaction;
	}



	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaNumber() {
		return aNumber;
	}

	public void setaNumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public float getaBalance() {
		return aBalance;
	}

	public void setaBalance(float aBalance) {
		this.aBalance = aBalance;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public BankUser getOwner() {
		return owner;
	}

	public void setOwner(BankUser owner) {
		this.owner = owner;
	}

	public List<BankTransaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<BankTransaction> transaction) {
		this.transaction = transaction;
	}
	
	
	


	
	
	
	
	
//	public BankAccount(int aId, String aNumber, float aBalance, int uId) {
//		super();
//		this.aId = aId;
//		this.aNumber = aNumber;
//		this.aBalance = aBalance;
//		this.uId = uId;
//	}
//	
//	public BankAccount() {
//		
//		
//	}
//	
//	public int getaId() {
//		return aId;
//	}
//	public void setaId(int aId) {
//		this.aId = aId;
//	}
//	public String getaNumber() {
//		return aNumber;
//	}
//	public void setaNumber(String aNumber) {
//		this.aNumber = aNumber;
//	}
//	public float getaBalance() {
//		return aBalance;
//	}
//	public void setaBalance(float aBalance) {
//		this.aBalance = aBalance;
//	}
//	public int getuId() {
//		return uId;
//	}
//	public void setuId(int uId) {
//		this.uId = uId;
//	}

	
	
	
	
	
}

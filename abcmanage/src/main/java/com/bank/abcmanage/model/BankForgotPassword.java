package com.bank.abcmanage.model;

import java.sql.Timestamp;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class BankForgotPassword {
	
	@Id
	@NotNull
	private int uId;
	private int recoveryCode;
	private Timestamp lastDayUpdate;
	@OneToOne(mappedBy = "owner")
	private BankUser user;
	
	
	public BankForgotPassword() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankForgotPassword(@NotNull int uId, int recoveryCode, Timestamp lastDayUpdate, BankUser user) {
		super();
		this.uId = uId;
		this.recoveryCode = recoveryCode;
		this.lastDayUpdate = lastDayUpdate;
		this.user = user;
	}


	@Override
	public String toString() {
		return "BankForgotPassword [uId=" + uId + ", recoveryCode=" + recoveryCode + ", lastDayUpdate=" + lastDayUpdate
				+ ", user=" + user + "]";
	}


	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getRecoveryCode() {
		return recoveryCode;
	}

	public void setRecoveryCode(int recoveryCode) {
		this.recoveryCode = recoveryCode;
	}

	public Timestamp getLastDayUpdate() {
		return lastDayUpdate;
	}

	public void setLastDayUpdate(Timestamp lastDayUpdate) {
		this.lastDayUpdate = lastDayUpdate;
	}

	public BankUser getUser() {
		return user;
	}

	public void setUser(BankUser user) {
		this.user = user;
	}
	
	
	
	
	

}

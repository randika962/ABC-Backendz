package com.bank.abcmanage.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "banktransaction")
public class BankTransaction {
 	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tId;
	

	private float transacAmount;
	private String transacDecription;
	private String transacType;
	
	
	@Column(name = "date_Time")
	private Timestamp dateTime;
	
	
	private int aId;
	private Integer sourceAccId;
	private Integer destinationAccId;
	
	
	@ManyToOne()
	@JsonIgnoreProperties("sourceAccount")
	@JoinColumn(name ="sourceAccId", insertable = false, updatable = false, nullable = false, referencedColumnName = "aid")
	private BankAccount sourceAccount;
	
	
	public BankTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankTransaction(Integer tId, float transacAmount, String transacDecription, String transacType,
			Timestamp date_Time, int aId, Integer sourceAccId, Integer destinationAccId, BankAccount sourceAccount) {
		super();
		this.tId = tId;
		this.transacAmount = transacAmount;
		this.transacDecription = transacDecription;
		this.transacType = transacType;
		this.dateTime = date_Time;
		this.aId = aId;
		this.sourceAccId = sourceAccId;
		this.destinationAccId = destinationAccId;
		this.sourceAccount = sourceAccount;
	}


	@Override
	public String toString() {
		return "BankTransaction [tId=" + tId + ", transacAmount=" + transacAmount + ", transacDecription="
				+ transacDecription + ", transacType=" + transacType + ", date_Time=" + dateTime + ", aId=" + aId
				+ ", sourceAccId=" + sourceAccId + ", destinationAccId=" + destinationAccId + ", sourceAccount="
				+ sourceAccount + "]";
	}


	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public float getTransacAmount() {
		return transacAmount;
	}

	public void setTransacAmount(float transacAmount) {
		this.transacAmount = transacAmount;
	}

	public String getTransacDecription() {
		return transacDecription;
	}

	public void setTransacDecription(String transacDecription) {
		this.transacDecription = transacDecription;
	}

	public String getTransacType() {
		return transacType;
	}

	public void setTransacType(String transacType) {
		this.transacType = transacType;
	}

	public Timestamp getdate_Time() {
		return dateTime;
	}

	public void setdate_Time(Timestamp date_Time) {
		this.dateTime = date_Time;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public Integer getSourceAccId() {
		return sourceAccId;
	}

	public void setSourceAccId(Integer sourceAccId) {
		this.sourceAccId = sourceAccId;
	}

	public Integer getDestinationAccId() {
		return destinationAccId;
	}

	public void setDestinationAccId(Integer destinationAccId) {
		this.destinationAccId = destinationAccId;
	}

	public BankAccount getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(BankAccount sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	
	


	
	

	
	
}

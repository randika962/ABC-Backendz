package com.bank.abcmanage.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "banktransaction")
public class BankTransaction {
 	
	
	
	
	public BankTransaction(Integer tId, float transacAmount, String transacDecription, String transacType,
			Timestamp transacTime, int aId, Integer sourceAccId, Integer destinationAccId, BankAccount sourceAccount) {
		super();
		this.tId = tId;
		this.transacAmount = transacAmount;
		this.transacDecription = transacDecription;
		this.transacType = transacType;
		this.transacTime = transacTime;
		this.aId = aId;
		this.sourceAccId = sourceAccId;
		this.destinationAccId = destinationAccId;
		this.sourceAccount = sourceAccount;
	}



	public BankTransaction() {
		
		
		
	}
	
     

	@Override
	public String toString() {
		return "BankTransaction [tId=" + tId + ", transacAmount=" + transacAmount + ", transacDecription="
				+ transacDecription + ", transacType=" + transacType + ", transacTime=" + transacTime + ", aId=" + aId
				+ ", sourceAccId=" + sourceAccId + ", destinationAccId=" + destinationAccId + ", sourceAccount="
				+ sourceAccount + "]";
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tId;
	
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

	public Timestamp getTransacTime() {
		return transacTime;
	}

	public void setTransacTime(Timestamp transacTime) {
		this.transacTime = transacTime;
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


	private float transacAmount;
	private String transacDecription;
	private String transacType;
	private Timestamp transacTime;
	private int aId;
	private Integer sourceAccId;
	private Integer destinationAccId;
	
	@ManyToOne()
	@JoinColumn(name ="sourceAccId", insertable = false, updatable = false, nullable = false, referencedColumnName = "aid")
	private BankAccount sourceAccount;
	
	
}

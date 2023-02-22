package com.Transaction.Payee.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//@Table(name="Tpt/Payee")
public class Payee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String accountTo;
	private String accountFrom;
	private String bankName;
	private String date;
	private String accHolderName;
	private Long amount;
	private String ifscCode;
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountTo() {
		return accountTo;
	}
	public void setAccountTo(String accountTo) {
		this.accountTo = accountTo;
	}
	public String getAccountFrom() {
		return accountFrom;
	}
	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
	
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Payee(int id,String accountTo, String accountFrom, String bankName, String date, Long amount,String accHolderName, String IfscCode) {
		super();
		this.id=id;
		this.accountTo = accountTo;
		this.accountFrom = accountFrom;
		this.bankName = bankName;
		this.date = date;
		this.amount = amount;
		this.accHolderName=accHolderName;
		this.ifscCode=IfscCode;
	}
	public Payee() {
		super();
	}
	
	
}

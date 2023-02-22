package com.Transaction.Payee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class BankingEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@ManyToOne
	private User user;
	private String accountnumber;
	private String ifscCode;
	private String branch;
	private Long balance;
	
	
	
	
	public BankingEntity(User user, String accountnumber, String iFSCCode, String branch,
			Long balance, int id) {
		super();
		this.id = id;
		this.user=user;
		this.accountnumber = accountnumber;
		this.ifscCode = iFSCCode;
		this.branch = branch;
		this.balance = balance;
	}
	
	
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


	public BankingEntity() {
		super();
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}


//	public String getaccountnumber() {
//		return accountnumber;
//	}
//	public void setaccountnumber(String accountnumber) {
//		this.accountnumber = accountnumber;
//	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	
}

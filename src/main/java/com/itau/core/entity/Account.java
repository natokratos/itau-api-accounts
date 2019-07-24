package com.itau.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="accountId")
    private String accountId;
	@Column(name="accountNumber")
    private String accountNumber;
	@Column(name="ownerCustomerId")
    private String ownerCustomerId;
	@Column(name="name")
    private String name;
	@Column(name="accountType")
    private String accountType;
	@Column(name="available")
    private Double available;
	@Column(name="balance")
    private Double balance;
	@Column(name="creditLimit")
    private Double creditLimit;
   
    public Account() {
    	this.accountId = "";
    	this.accountNumber = "";
    	this.ownerCustomerId = "";
    	this.name = "";
    	this.accountType = "";
    	this.available = 0.0;
    	this.balance = 0.0;
    	this.creditLimit = 0.0;
    }
    
    public Account(String accountId, String accountNumber, 
    			String ownerCustomerId, String name, 
    			String accountType, Double available, 
    			Double balance, Double creditLimit) {
    	this.accountId = accountId;
    	this.accountNumber = accountNumber;
    	this.ownerCustomerId = ownerCustomerId;
    	this.name = name;
    	this.accountType = accountType;
    	this.available = available;
    	this.balance = balance;
    	this.creditLimit = creditLimit;
    }
    
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerCustomerId() {
		return ownerCustomerId;
	}
	public void setOwnerCustomerId(String ownerCustomerId) {
		this.ownerCustomerId = ownerCustomerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Double getAvailable() {
		return available;
	}
	public void setAvailable(Double available) {
		this.available = available;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

}

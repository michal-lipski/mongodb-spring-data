package com.mongodb.domain;

import com.mysema.query.annotations.QueryEmbeddable;

@QueryEmbeddable
public class Account {

	public enum Type {
		SAVINGS, CHECKING
	}

	private String id;

	private String accountNumber;

	private Type accountType;

	private Double balance;

	public Account() {
	}

	public Account(String accountNumber, Type accountType, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Type getAccountType() {
		return accountType;
	}

	public void setAccountType(Type accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + ", balance=" + balance + "]";
	}

}

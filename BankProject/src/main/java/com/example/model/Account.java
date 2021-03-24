package com.example.model;

import java.util.List;

public class Account {

	private int id;
	private float balance;
	private Customer customer;
	private String accountnumber;
	private Transaction transaction;
	
	public Account() {
		super();
	}

	public Account(int id, float balance, Customer customer,String accountnumber,Transaction transaction) {
		super();
		this.id = id;
		this.balance = balance;
		this.customer = customer;
		this.accountnumber=accountnumber;
		this.transaction=transaction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	
	

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", customer=" + customer + ", accountnumber="
				+ accountnumber + ", transaction=" + transaction + "]";
	}

	
	
	
	
	
	
}

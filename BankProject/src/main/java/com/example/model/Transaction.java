package com.example.model;

public class Transaction {

	



	private int tid;
	private String transactiontype;
	private String transactionstatus;
	private float amount;
	private String transactiondate;
	private String accountnumber;
	
	
	public Transaction() {
		super();
	}
	
	
	
	
	public Transaction(int tid, String transactiontype, String transactionstatus, float amount, String transactiondate,
			String accountnumber) {
		super();
		this.tid = tid;
		this.transactiontype = transactiontype;
		this.transactionstatus = transactionstatus;
		this.amount = amount;
		this.transactiondate = transactiondate;
		this.accountnumber = accountnumber;
	}



	public Transaction(String transactiontype, String transactionstatus, float amount, String transactiondate,
			String accountnumber) {
		super();
		this.transactiontype = transactiontype;
		this.transactionstatus = transactionstatus;
		this.amount = amount;
		this.transactiondate = transactiondate;
		this.accountnumber = accountnumber;
	}

	
	

	public int getTid() {
		return tid;
	}




	public int setTid(int tid) {
		return this.tid = tid;
	}




	public String getTransactiontype() {
		return transactiontype;
	}




	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}




	public String getTransactionstatus() {
		return transactionstatus;
	}




	public void setTransactionstatus(String transactionstatus) {
		this.transactionstatus = transactionstatus;
	}




	public float getAmount() {
		return amount;
	}




	public void setAmount(float amount) {
		this.amount = amount;
	}




	public String getTransactiondate() {
		return transactiondate;
	}




	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}




	public String getAccountnumber() {
		return accountnumber;
	}




	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}




	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", transactiontype=" + transactiontype + ", transactionstatus="
				+ transactionstatus + ", amount=" + amount + ", transactiondate=" + transactiondate + ", accountnumber="
				+ accountnumber + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

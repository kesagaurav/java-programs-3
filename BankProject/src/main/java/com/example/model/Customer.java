package com.example.model;

import java.util.Date;

public class Customer {

	private int customerid;
	private String firstname;
	private String lastname;
	private String dateofbirth;
	private String password;
	
	
	public Customer() {
		super();
	}
	
	
	
	public Customer(int customerid, String firstname, String lastname,String dateofbirth, String password) {
		super();
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.password=password;
		
	}



	


	public int getCustomerid() {
		return customerid;
	}



	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getDateofbirth() {
		return   dateofbirth;
	}



	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}



	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dateofbirth=" + dateofbirth + ", password=" + password + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}

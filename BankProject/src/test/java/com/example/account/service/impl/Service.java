package com.example.account.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.model.Transaction;

public class Service {

	






	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}






	public static AccountServiceImpl service;
	
	
	
	@Before
	public  void setUpService() {
		service=new AccountServiceImpl() ;
	}
	
	
	
	
	
	
	@Test
	public  void testvalidisCredentials() {
		Customer c=new Customer(1,"gaurav","kesa","1998-11-19","abc123");
		Transaction t=new Transaction("withdrawl","approved",12000,"12-11-1998","123456");
		Account a=new Account(13,12000,c,"123456",t);
		try {
			assertEquals(0,service.addAccount(a));
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}

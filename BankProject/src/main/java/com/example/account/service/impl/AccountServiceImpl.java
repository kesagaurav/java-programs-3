package com.example.account.service.impl;

import com.example.account.dao.AccountDao;
import com.example.account.dao.impl.AccountDaoImpl;
import com.example.account.service.AccountService;
import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Transaction;

public class AccountServiceImpl implements AccountService{

	public AccountDao as=new AccountDaoImpl();
	
	@Override
	public int addAccount(Account a) throws BusinessException {
	
		return as.addAccount(a);
	}

	@Override
	public Transaction makeWithdrawl(Transaction withdrawl, int customerid) throws BusinessException {
		// TODO Auto-generated method stub
		return as.makeWithdrawl(withdrawl, customerid);
	}






	




}

package com.example.account.service;

import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Transaction;


public interface AccountService {

	public int addAccount(Account a) throws BusinessException;
	//public int registerAccount(Account a)throws BusinessException;
	public Transaction makeWithdrawl(Transaction withdrawl,int customerid)throws BusinessException;
	//int id)
}

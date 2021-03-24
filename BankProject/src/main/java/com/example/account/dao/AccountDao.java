package com.example.account.dao;

import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Transaction;

public interface AccountDao {
	public int addAccount(Account a) throws BusinessException;
	public Transaction makeWithdrawl(Transaction withdrawl,int customerid) throws BusinessException;
	

}

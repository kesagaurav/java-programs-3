package com.example.account.service.impl;

import com.example.account.dao.AccountSearchDao;
import com.example.account.dao.impl.AccountSearchDaoImpl;
import com.example.account.service.AccountSearchService;
import com.example.exception.BusinessException;
import com.example.model.Account;

public class AccountSearchImpl implements AccountSearchService {

	private AccountSearchDao asdao=new AccountSearchDaoImpl();
	
	@Override
	public Account getAccountByAccountNumber(String accountnumber) throws BusinessException {
		
		return asdao.getAccountByAccountNumber(accountnumber);
	}

}

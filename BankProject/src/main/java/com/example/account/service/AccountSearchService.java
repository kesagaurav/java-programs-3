package com.example.account.service;

import com.example.exception.BusinessException;
import com.example.model.Account;

public interface AccountSearchService {

	public Account getAccountByAccountNumber(String accountnumber)throws BusinessException;
	
}

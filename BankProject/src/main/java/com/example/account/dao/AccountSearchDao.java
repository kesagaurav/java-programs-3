package com.example.account.dao;

import com.example.exception.BusinessException;
import com.example.model.Account;

public interface AccountSearchDao {
	public Account getAccountByAccountNumber(String accountnumber)throws BusinessException;

}

package com.example.account.service.impl;

public class AccountValidation {

	public static boolean isNonNegativeNumber(float number) {
		return (number>=0)?true:false;
	}
	
	public static boolean isBalanceGreater(float balance,float number) {
		return (balance>=number)?true:false;
	}
	
	public static boolean isValidTransactionAmount(double amount) {
		if(amount<=0) {
			return true;
		}else {
			return false;
		}
	}
	
}

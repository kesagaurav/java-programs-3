package com.example.main;

import java.text.NumberFormat;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.example.account.service.AccountService;
import com.example.account.service.impl.AccountServiceImpl;
import com.example.exception.BusinessException;
import com.example.model.Transaction;


public class Withdrawl {
	private static Logger log=Logger.getLogger(Withdrawl.class);
	public static void makeWithdrawl(int customerid) throws BusinessException {
		
		Scanner sc=new Scanner(System.in);
		AccountService as=new AccountServiceImpl();
		Transaction withdrawlResult=new Transaction();
		try {
			log.info("\n enter accountnumber");
			withdrawlResult.setAccountnumber(sc.nextLine());
			}catch(NumberFormatException e) {
			log.warn("enter account is invalid");
			return;
		}
		try {
			log.info("\n enter an amount");
			withdrawlResult.setAmount(Float.parseFloat(sc.nextLine()));
		}catch(NumberFormatException e) {
			log.info("entered amount" + String.valueOf(withdrawlResult.getAmount()) + "is invalid");
		}
		
		try {
			withdrawlResult.setTransactiontype("withdrawl");
			withdrawlResult.setTransactionstatus("success");
			try {
				withdrawlResult=as.makeWithdrawl(withdrawlResult, customerid);
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
			log.warn(e.getMessage());
			
			}
			if(withdrawlResult!=null) {
				log.info("the amount of " + withdrawlResult.getAmount()+ "was withdrawn with accountnumber" + withdrawlResult.getAccountnumber());
				
			}
			
		}
		catch(NumberFormatException e) {
			log.info("entered amount " + String.valueOf(withdrawlResult.getAmount() + " is invalid"));
		}
	}
	

}

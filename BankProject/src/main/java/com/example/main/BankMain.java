package com.example.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.example.account.service.AccountSearchService;
import com.example.account.service.AccountService;
import com.example.account.service.impl.AccountSearchImpl;
import com.example.account.service.impl.AccountServiceImpl;
import com.example.customer.service.CustomerService;
import com.example.customer.service.impl.CustomerServiceImpl;
import com.example.employee.service.EmployeeService;
import com.example.employee.service.impl.EmployeeServiceImpl;
import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.model.Transaction;


public class BankMain {

	private static Logger log=Logger.getLogger(BankMain.class);
	
	public static void main(String[] args) throws BusinessException     {

	Scanner sc=new Scanner(System.in);

	CustomerService cs=new CustomerServiceImpl();
	Customer c=new Customer();
	Account a=new Account();
	AccountService as=new AccountServiceImpl();
	EmployeeService es=new EmployeeServiceImpl();
	
	int ch=0;

	
	do {
		log.info(" 0.exit");
		log.info(" 1.customer login");
		log.info(" 2.regiter an account as an customer");
		log.info(" 3.register an new customer");
		log.info(" 4.as a customer you can view a balance for specific account");
		log.info(" 5.employee login");
		log.info(" 6.withdrawl an amount");
		try {
			log.info("\n enter your choice");
			ch=Integer.parseInt(sc.nextLine());

		}catch(NumberFormatException e) {
			log.warn(e.getMessage());
		}
		
		switch(ch) {
		case 1:log.debug("\n here is the login information");
		try {
			log.info("\n enter id");
			int id=Integer.parseInt(sc.nextLine());
			log.info("\n enter password");
			String password=sc.nextLine();
			log.debug( cs.addCredientails(id,password));
			
		} catch (BusinessException e) {
		log.warn("invalid id and password");
		log.warn(e.getMessage());
		
		}
		break;
		
		case 2:log.debug("\n to register an account");
		log.info("\n enter account id");
		a.setId(Integer.parseInt(sc.nextLine()));
		
		log.info("\n enter the balance");
		a.setBalance(Float.parseFloat(sc.nextLine()));
		
		log.info("\n enter the accountnumber");
		a.setAccountnumber(sc.nextLine());
		
		log.info("\n enter the customer details with the below list");
			try {
				List<Customer> cuslist=cs.getAllCustomers();
				for(Customer cs1:cuslist) {
					log.info(cs1.getFirstname());
				}
				log.info(cuslist.size() +1+")Not preffered for now");
			
				try {
					log.info("please enter your customer choice bewteen 1-"+(cuslist.size()+1));
					int choice=Integer.parseInt(sc.nextLine());
					if(choice>0 && choice<=cuslist.size()+1) {
						if(choice==cuslist.size()+1) {
							a.setCustomer(new Customer());
						}else {
							a.setCustomer(cuslist.get(choice-1));
						}
					}else {
						log.info("invalid choice");
					}
				}catch(NumberFormatException e) {
					log.info("account id should be number only");
					break;
				}
			
			
			
			} catch (BusinessException e2) {
				// TODO Auto-generated catch block
			log.warn(e2.getMessage());
			}
	
			
		try {
			if(as.addAccount(a)==1) {
			log.info("account is regeisterd successfully");
				log.info(a);
			}
		}catch (BusinessException e) {
			// TODO Auto-generated catch block
			log.info(e.getMessage());
		
		}
	
		
		case 3:log.info("\n plz enter the customer detais to register ");
		log.info("\n enter id");
		c.setCustomerid(Integer.parseInt(sc.nextLine()));
		log.info("\n enter firstname");
		c.setFirstname(sc.nextLine());
		log.info("\n enter an lastname");
		c.setLastname(sc.nextLine());
		log.info("\n enter date of birth");
			c.setDateofbirth(sc.nextLine());
			log.info("\n enter password");
			c.setPassword(sc.nextLine());
			try {
				cs.addCustomer(c);
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		case 4:
			int option=0;
			AccountSearchService as1=new AccountSearchImpl();
			do {
				log.info("select beow option to search a balance");
				log.info("1)By AccountNumber");
				try {
					option=Integer.parseInt(sc.nextLine());
				}catch(NumberFormatException e) {
					log.warn("\n invalid ption for the account balance");
				}
				switch (option) {
				case 1:
					log.info("\n enter account number to get the balance");
					try {
						String accountNumber=sc.nextLine();
						Account a1=as1.getAccountByAccountNumber(accountNumber);
						if(a1!=null) {
							log.info("balance found with the " + accountNumber);
							log.info(" the balance is " + a1.getBalance());
						
						}
					}catch(NumberFormatException e) {
						log.info("\n account no is invaid");
					}catch(BusinessException e) {
						log.info(e.getMessage());
					}
					break;

				default:
					break;
				}
				
				
					
			}while(ch!=2);
		case 5:
			log.info("the employee details are");
		
			try {
				log.info("\n enter the employee id");
				int empid=Integer.parseInt(sc.nextLine());
				log.info("\n enter an password");
				String password=sc.nextLine();
				es.addEmployeeCredentials(empid, password);
			} catch (BusinessException e) {
				log.info(e.getMessage());
				
			}
			
		case 6:
		
			Withdrawl withdrawlAmount=new Withdrawl();
			try {
				log.info("\n enter your id");
				int customerid=Integer.parseInt(sc.nextLine());
				withdrawlAmount.makeWithdrawl(customerid);
			
			}catch(NumberFormatException e){
				log.warn(e.getMessage());
			}
		}
		

		break;
	}while (ch!=6);
		
	
	
	
	


	}


	}


	

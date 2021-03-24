package com.example.account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.example.account.dao.AccountDao;
import com.example.account.service.impl.AccountValidation;
import com.example.customer.dao.impl.CustomerDaoImpl;
import com.example.dbutil.PostGres;
import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.model.Transaction;

public class AccountDaoImpl implements AccountDao {

	private static Logger log=Logger.getLogger(AccountDaoImpl.class);
	private static int tid=1;
	//private AccountDao ad=new AccountDaoImpl();
	@Override
	public int addAccount(Account a) throws BusinessException {
		int c=0;
		try(Connection con=PostGres.getConnection()){
			String sql="insert into bank_schema.account(accountid,balance,accountnumber,customerid) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, a.getId());
			ps.setFloat(2, a.getBalance());
			ps.setString(3, a.getAccountnumber());
			ps.setInt(4, a.getCustomer().getCustomerid());
			c=ps.executeUpdate();
			log.info("\n account has created successfully" + c);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			log.warn("\n invalid account plz create an new account");
			log.warn(e);
		} 
		return c;
	}

	
	


	@Override
	public Transaction makeWithdrawl(Transaction withdrawl,int customerid) throws BusinessException {
		float newBalance=0;
		int updateResult=0;
		int updateResult2=0;
		try(Connection con=PostGres.getConnection()){
			String sql="select a.accountnumber,a.balance from bank_schema.customer c join bank_schema.account a  on c.customerid =a.customerid where a.accountnumber=? and c.customerid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,withdrawl.getAccountnumber());
			ps.setInt(2,customerid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				newBalance=rs.getFloat("balance")-withdrawl.getAmount();
				if(!AccountValidation.isValidTransactionAmount(newBalance)) {
					log.warn("\n insufficient funds");
					throw new BusinessException();
					
				}
				sql="update bank_schema.account set balance=? where  accountnumber=?";
				ps=con.prepareStatement(sql);
				ps.setFloat(1,newBalance);
				ps.setString(2,withdrawl.getAccountnumber());
				updateResult=ps.executeUpdate();
				sql="insert into bank_schema.transaction(transactiontype,transactionstatus,amount,accountnumber,transactiondate)values(?,?,?,?,?)";
				ps=con.prepareStatement(sql);
		
				
				ps.setString(1,withdrawl.getTransactiontype());
				ps.setString(2,withdrawl.getTransactionstatus());
				ps.setFloat(3,withdrawl.getAmount());
				ps.setString(4,withdrawl.getTransactiondate());
				ps.setString(5,withdrawl.getAccountnumber());
				updateResult2=ps.executeUpdate();
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
		}
		
		if(updateResult==0||updateResult2==0) {
			log.info("Withdrawal to " + withdrawl.getAccountnumber() + " was unsuccessful");
		}
		
		
		return withdrawl;
	}
	
	
	}


	
	


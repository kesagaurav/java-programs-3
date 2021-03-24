package com.example.account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.account.dao.AccountSearchDao;
import com.example.dbutil.PostGres;
import com.example.exception.BusinessException;
import com.example.model.Account;

import jdk.internal.org.jline.utils.Log;

public class AccountSearchDaoImpl implements AccountSearchDao{

	@Override
	public Account getAccountByAccountNumber(String accountnumber) throws BusinessException {
		Account a=null;
		try(Connection con=PostGres.getConnection()){
			String sql="select accountnumber,balance from bank_schema.account where accountnumber=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,accountnumber);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				 a=new Account();
				a.setAccountnumber(accountnumber);
				a.setBalance(rs.getFloat("balance"));
			}
			if(a==null) {
				throw new BusinessException("\n invalid balance");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			Log.warn(e.getMessage());
		}
		return a;
	}

}

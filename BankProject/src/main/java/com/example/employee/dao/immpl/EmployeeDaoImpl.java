package com.example.employee.dao.immpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.example.account.dao.impl.AccountDaoImpl;
import com.example.dbutil.PostGres;
import com.example.employee.dao.EmployeeDao;
import com.example.exception.BusinessException;
import com.example.model.Customer;
import com.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Logger log=Logger.getLogger(EmployeeDaoImpl.class);
	@Override
	public int addEmployeeCredentials(int empid, String password) throws BusinessException {
		int c=0;
		try(Connection con=PostGres.getConnection()){
			String sql="select empid,password from bank_schema.employee where empid=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, empid);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee c1=new Employee();
				c1.setEmpid(rs.getInt("empid"));
				c1.setPassword(rs.getString("password"));
			}
				log.info("successfully employee has logged in ");
			
		} catch (ClassNotFoundException | SQLException e) {
		
			log.warn(e.getMessage());
			log.warn(e);
		}
		return c;
	}

}

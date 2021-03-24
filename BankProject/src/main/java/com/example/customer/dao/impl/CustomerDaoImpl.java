package com.example.customer.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.example.customer.dao.CustomerDao;
import com.example.dbutil.PostGres;
import com.example.exception.BusinessException;
import com.example.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

//	private CustomerDao cdao=new CustomerDaoImpl();
	private static Logger log=Logger.getLogger(CustomerDaoImpl.class);
	@Override
	public int addCredientails(int id, String password) throws BusinessException {
		
		int c=0;
		try(Connection con=PostGres.getConnection()){
			//String sql="select customerid,password from bank_schema.customer where customerid=? and password=?";
			String sql="select customerid,password from bank_schema.customer where customerid=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			//c=ps.executeUpdate();
			while(rs.next()) {
				Customer c1=new Customer();
				c1.setCustomerid(rs.getInt("customerid"));
				c1.setPassword(rs.getString("password"));
			}
				log.info("successfully logged in");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			log.warn("invalid id and password");
			log.warn(e);
		}
		
		return c;
	}

	
	

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {

		List<Customer> cuslist=new ArrayList();
		try(Connection con=PostGres.getConnection()){
			String sql="select customerid,firstname,lastname,dateofbirth,password from bank_schema.customer";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Customer c=new Customer();
				c.setCustomerid(rs.getInt("customerid"));
				c.setFirstname(rs.getString("firstname"));
				c.setLastname(rs.getString("lastname"));
				c.setPassword(rs.getString("password"));
				c.setDateofbirth(rs.getString("dateofbirth"));
				cuslist.add(c);
			}
			if(cuslist.size()==0) {
				log.warn("no customer was registered");
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new BusinessException("\n internal server has occured");
		}
		
		return cuslist;
	}




	@Override
	public int addCustomer(Customer c) throws BusinessException {
		int c1=0;
		try(Connection con=PostGres.getConnection()){
			//String sql="select customerid,firstname,lastname,dateofbirth,password from bank_schema.customer";
			String sql="insert into bank_schema.customer(customerid,firstname,lastname,dateofbirth,password) values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, c.getCustomerid());
			ps.setString(2,c.getFirstname());
			ps.setString(3,c.getLastname());
			ps.setString(4, c.getDateofbirth());
			ps.setString(5,c.getPassword());
			c1=ps.executeUpdate();
			log.info("successfully added to the database " + c1);
		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e.getMessage());
		} 
		return c1;
	}

	
}

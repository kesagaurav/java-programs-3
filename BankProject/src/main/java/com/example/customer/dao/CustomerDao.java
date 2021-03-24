package com.example.customer.dao;

import java.util.List;

import com.example.exception.BusinessException;
import com.example.model.Customer;

public interface CustomerDao {
	
	public int addCredientails(int id,String password) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
	public int addCustomer(Customer c) throws BusinessException;

}

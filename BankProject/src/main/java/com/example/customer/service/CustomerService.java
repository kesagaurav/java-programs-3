package com.example.customer.service;



import java.util.List;

import org.apache.log4j.Logger;

import com.example.exception.BusinessException;
import com.example.model.Customer;

public interface CustomerService {

	public int addCredientails(int id,String password) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
	public int addCustomer(Customer c)throws BusinessException;
}

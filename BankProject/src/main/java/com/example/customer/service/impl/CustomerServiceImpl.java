package com.example.customer.service.impl;

import java.util.List;

import com.example.customer.dao.CustomerDao;
import com.example.customer.dao.impl.CustomerDaoImpl;
import com.example.customer.service.CustomerService;
import com.example.exception.BusinessException;
import com.example.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao csdao=new CustomerDaoImpl();
	@Override
	public int addCredientails(int id, String password) throws BusinessException {
		// TODO Auto-generated method stub
		return csdao.addCredientails(id, password);
	}

	

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {

		
		
		return csdao.getAllCustomers();
	}



	@Override
	public int addCustomer(Customer c) throws BusinessException {
		
		return csdao.addCustomer(c);
	}



	




	
	
	
}

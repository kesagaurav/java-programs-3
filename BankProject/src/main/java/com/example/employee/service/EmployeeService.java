package com.example.employee.service;

import com.example.exception.BusinessException;

public interface EmployeeService {

	public int addEmployeeCredentials(int empid,String password)throws BusinessException;
		
	
	
}

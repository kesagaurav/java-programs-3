package com.example.employee.dao;

import com.example.exception.BusinessException;

public interface EmployeeDao {
	
	public int addEmployeeCredentials(int empid,String password)throws BusinessException;

	
}

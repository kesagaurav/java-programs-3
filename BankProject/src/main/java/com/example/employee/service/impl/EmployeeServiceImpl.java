package com.example.employee.service.impl;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.dao.immpl.EmployeeDaoImpl;
import com.example.employee.service.EmployeeService;
import com.example.exception.BusinessException;

public class EmployeeServiceImpl  implements EmployeeService{

	private EmployeeDao ed=new EmployeeDaoImpl();
	
	@Override
	public int addEmployeeCredentials(int empid, String password) throws BusinessException {
	
		return ed.addEmployeeCredentials(empid, password);
	}

}

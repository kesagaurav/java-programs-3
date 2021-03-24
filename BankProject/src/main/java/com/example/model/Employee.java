package com.example.model;

public class Employee {

	private int empid;
	private String password;
	private String empname;
	private Account a;
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(int empid, String password, String empname, Account a) {
		super();
		this.empid = empid;
		this.password = password;
		this.empname = empname;
		this.a = a;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Account getA() {
		return a;
	}

	public void setA(Account a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", password=" + password + ", empname=" + empname + ", a=" + a + "]";
	}
	
	
	
	
	
}

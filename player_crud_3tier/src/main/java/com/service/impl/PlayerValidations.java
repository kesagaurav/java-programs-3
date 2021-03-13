package com.service.impl;

public class PlayerValidations {
	public static boolean isValidId(int id) {
		if(id<100||id>1000) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isValidPlayerName(String name) {
		if(name!=null && name.matches("[a-zA-Z]{3,20}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidPlayerCity(String city) {
		if(city!=null && city.matches("[a-zA-Z]{3,5}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isValidPlayergener(String gender) {
		if(gender!=null && gender.matches("[a-zA-Z]{3,20}")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static boolean isValidPlayerage(int age) {
		if(age>14 && age<100) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
}

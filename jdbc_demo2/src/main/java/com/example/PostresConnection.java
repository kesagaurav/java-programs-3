package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostresConnection {

	private static Connection con;
	
	private PostresConnection() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		if(con==null) {
		Class.forName("org.postgresql.Driver");
	
	// step 2 - open connection
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="1234";
		con =DriverManager.getConnection(url,username,password);
		return con;
		}else {
			return con;
		}
	
	}

}

// creational design pattern -"singleton" java class
//1) keep a static variable
//2)disable the constructor access by making it private
//3)keep a static method which returns the instance of static variable/object
//check if the instance aleready crated and return it accordingly

package com.example.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostGres {
private static Connection con;
	
	private PostGres() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		
		Class.forName("org.postgresql.Driver");
	
	// step 2 - open connection
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="1234";
		con =DriverManager.getConnection(url,username,password);
		return con;
			//return con;
		
	
	}

}

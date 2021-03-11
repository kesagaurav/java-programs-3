package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		Connection con=null;
		// step 1 : load driver
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver installed successfully");
		
		// step 2 - open connection
			String url="jdbc:postgresql://localhost:5432/postgres";
			String username="postgres";
			String password="1234";
			con =DriverManager.getConnection(url,username,password);
			System.out.println("\n connection sucessful");
		// step 3-create statement
		Statement st=con.createStatement();
		//String sql="select id,name,age,city,gender from player4 ";
		String sql="select p.id, p.name, p.city, p.age ,p.gender, t.teamname, t.location " + " from player4 p join team t "+ " on p.teamid =t.teamid";
		//step 4 -execute query
		ResultSet rs=st.executeQuery(sql);
		System.out.println("\n query exceuted");
		
		//step 5 -process results
			while(rs.next()) {
				System.out.print("player id is: " + rs.getInt("id"));
				System.out.print("name is: " + rs.getString("name"));
				System.out.print("city: " + rs.getString("city"));
				System.out.print("gender: "  + rs.getString("gender"));
				System.out.print("age: " + rs.getString("age"));
				System.out.print("teamname: " + rs.getString("teamname"));
				System.out.println("location: " + rs.getString("location"));
				}
			
			System.out.println("Results processed successfully");
		
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				con.close();
				System.out.println("\n connection is closed");
			}catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}

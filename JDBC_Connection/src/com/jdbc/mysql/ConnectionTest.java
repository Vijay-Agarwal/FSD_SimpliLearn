package com.jdbc.mysql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionTest {
	public static void main(String[] args) throws Exception {
	      
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Estiblished");
	      // variables
	      final String url = "jdbc:mysql://localhost:3306/mydb";
	      final String user = "root";
	      final String pass = "root";
	      // establish the connection
	      Connection con = DriverManager.getConnection(url,user,pass);
	      Statement stmt=(Statement) con.createStatement();  
	      ResultSet rs=stmt.executeQuery("select * from testing");
	      while(rs.next())  
	      System.out.println(rs.getString(1)+"  "+rs.getInt(2)); 
	      con.close(); 
	}catch (Exception e)
	{System.out.println(e);
	}
	}
}
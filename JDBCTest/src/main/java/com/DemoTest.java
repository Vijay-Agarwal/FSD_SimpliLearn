package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoTest {
public static void main(String args[]) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Successfully Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		System.out.println("Connected Successfully");
		Statement stmt =con.createStatement();
		int res=stmt.executeUpdate("Insert into student values (2,'Ramesh',24)");
		if(res>0)
		{System.out.println("Record Inserted Successfully");}
	}catch (Exception e)
	{System.out.println(e);}
}
	// TODO Auto-generated method stub


}

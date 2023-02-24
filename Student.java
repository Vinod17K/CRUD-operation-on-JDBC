package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent1","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into student values(3,'nandini',22)");
			connection.close();
			System.out.println("Data Saved!!");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

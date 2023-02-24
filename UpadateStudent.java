package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpadateStudent {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent1","root","root");
			Statement statement=connection.createStatement();
			statement.execute("update student set name='dawwood' where id=3");
			statement.close();
			System.out.println("Data saved");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

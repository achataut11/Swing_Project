package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection getDbCon()  {
		
		try {
			
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//getConnection
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

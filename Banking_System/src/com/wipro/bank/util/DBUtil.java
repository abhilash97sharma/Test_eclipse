package com.wipro.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection(){
		try{
		Class.forName("oracle.jdbc.OracleDriver");
	    Connection ct=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","modulle1","sharma25");
		return ct;
		}catch(SQLException e){
			System.out.println("Connection not established");
		}catch(ClassNotFoundException e){
			System.out.println("Driver not registered");
		}
		return null;
	}
}

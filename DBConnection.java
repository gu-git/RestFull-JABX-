package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static DBConnection Cobj = new DBConnection();
	
	 private DBConnection(){}
	 
	public static DBConnection getDBConnection(){
		 
		 return Cobj;
	 }
	 
	 public Connection doConnection(){
		 
		 Connection connection = null;
         String connectionURL = "jdbc:mysql://localhost:3306/myapp";
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             connection = DriverManager.getConnection(connectionURL,"root","root123");
         } catch (Exception ex) {
             System.out.println("Database Connection Problem: " + ex);
         }
                      return connection;
         
	 }

}

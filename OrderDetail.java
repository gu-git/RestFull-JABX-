package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.connection.DBConnection;
import com.rest.jaxb.EmployeeOrder;

public class OrderDetail {
	public EmployeeOrder getUserDetail(int Id) {
		Connection con = null;
        ResultSet rs;
        EmployeeOrder emp = new EmployeeOrder();
       // String Id = id;
        System.out.println("This is from a DAO class");
        try {
            DBConnection db = DBConnection.getDBConnection();
            con = db.doConnection();
           
            
            PreparedStatement p = con.prepareStatement("select * from employee where Id = ?") ;
            		p.setString(1, Integer.toString(Id));


            rs=p.executeQuery();
          
          if(rs.next())
            {
        	  {
                  String PId = rs.getString(1);
                  String firstName = rs.getString(2);
                  String lastName = rs.getString(3);
                  String Address = rs.getString(4);
                   int Salary = rs.getInt(5);
                  
                  
                 emp.setId(PId);
                 emp.setFirstName(firstName);
                 emp.setLastName(lastName);
                 emp.setAddress(Address);
                 emp.setSalary(Salary);
                 

                 
              }
            }
            
                        
            }
            catch(Exception e)
            {
            	
            }

		return emp; 
       
	}
}

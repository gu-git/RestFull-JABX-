package com.rest.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "order")
public class EmployeeOrder {
 
     
    private String Id;
    private String FirstName;
    private String LastName;
    private String address;
    private int Salary;
    
    @XmlAttribute(name = "order-Id")
	public String getId() {
		return Id;
	}
	public void setId(String pId) {
		Id = pId;
	}
	
	 @XmlElement
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	 @XmlElement
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	 @XmlElement
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 @XmlElement
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int salary){
		
		this.Salary = salary;
	}
     
    
   
     
   
   
     
}

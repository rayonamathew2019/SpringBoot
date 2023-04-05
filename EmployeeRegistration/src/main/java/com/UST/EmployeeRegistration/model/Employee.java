/**
 * 
 */
package com.UST.EmployeeRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;

/**
 * @author Administrator
 *
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue
	
	private int id;
	private String empid;
	private String empname;
	private String adress;
	private String location;
	
	
	
	public Employee(int id, String empid, String empname, String adress, String location) {
		super();
		this.id = id;
		this.empid = empid;
		this.empname = empname;
		this.adress = adress;
		this.location = location;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}

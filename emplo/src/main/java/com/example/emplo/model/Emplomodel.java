package com.example.emplo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
@Entity
public class Emplomodel {
	@Id
	@GeneratedValue
	
	private int id;
	private String Name;
	private String Email;
	private int Experience;
	private String Developer;
	public Emplomodel(int id, String name, String email, int experience, String developer) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Experience = experience;
		Developer = developer;
	}
	public Emplomodel() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getDeveloper() {
		return Developer;
	}
	public void setDeveloper(String developer) {
		Developer = developer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
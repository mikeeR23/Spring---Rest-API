package com.example.demo.employee.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	// Set to auto since ID is set to AUTO_INCREMENT IN DATABASE
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

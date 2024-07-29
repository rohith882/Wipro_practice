package com.API;
import java.util.List;

public class Employee {
	private Integer id;
	private String name; 
	private String email;
	private List<String> phoneNumbers;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Employee(Integer id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	
	public Employee()
	{
		
	}
	
	
}


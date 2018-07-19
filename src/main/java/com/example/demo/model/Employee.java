package com.example.demo.model;
/*
 * POJO class for employee
 */
public class Employee {
	private int id;
	private String fName;
	private String lName;
	private String address;
	
	//Constructor
	public Employee() {
		super();
	}
	public Employee(int id, String fName, String lName, String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lNmae=" + lName + ", address=" + address + "]";
	}
	
	
	
}

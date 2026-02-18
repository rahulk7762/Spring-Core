package com.my.spring.model;

abstract public class Employee {

	private int id;
	private String name,gender;
	private Address address;
	
	public abstract Address applyAddress();
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	
	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	

}

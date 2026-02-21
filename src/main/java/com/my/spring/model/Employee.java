package com.my.spring.model;


public class Employee {

	private int id;
	private String name,gender;
	private int salary;
	
	public Employee() {
		super();
		System.out.println("Employee()");
	}
	
	public Employee(int id,String name,String gender,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		System.out.println("Employee(3)");
	}
	
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	

}

package com.my.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{

	private int id;
	private String name,gender;
	private Address address;
	
	public Employee() {
		super();
		System.out.println("Employee()");
	}
	
	public Employee(int id,String name,String gender,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Employee(3)");
	}
	
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

	//InitializingBean method
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("Employee.afterPropertiesSet()");
		}
		
		//DisposableBean method
		@Override
		public void destroy() throws Exception {
			System.out.println("Employee.destroy()");
		}
		
	
	
	private void xmlInitMethod() {
		System.out.println("Employee.xmlInitMethod()");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("Employee.xmlDestroyMethod()");
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	

}

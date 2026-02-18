package com.my.spring.model;

public class DatabaseSingleton {

	public DatabaseSingleton() {
		super();
	}
	
	// Eager loading or early instantiation
	private static DatabaseSingleton obj = new DatabaseSingleton();
	
	public static DatabaseSingleton getInstance() {
		return obj;
	}
	
}

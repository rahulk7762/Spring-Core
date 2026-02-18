package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.DatabaseSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc = new ClassPathXmlApplicationContext("factory.xml");
		
		DatabaseSingleton obj1 = ioc.getBean("dbSingleton",DatabaseSingleton.class);
		DatabaseSingleton obj2 = ioc.getBean("dbSingleton",DatabaseSingleton.class);
		DatabaseSingleton obj3 = ioc.getBean("dbSingleton",DatabaseSingleton.class);
		DatabaseSingleton obj4 = ioc.getBean("dbSingleton",DatabaseSingleton.class);
//		bean.setName("Rahul");
		
		System.out.println(obj1); // com.my.spring.model.DatabaseSingleton@475e586c
		System.out.println(obj2); // com.my.spring.model.DatabaseSingleton@475e586c
		System.out.println(obj3); // com.my.spring.model.DatabaseSingleton@475e586c
		System.out.println(obj4); // com.my.spring.model.DatabaseSingleton@475e586c
		
		
	}

}

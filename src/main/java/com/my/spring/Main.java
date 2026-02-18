package com.my.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("life_cycle_methods.xml");
		
		Employee bean = ioc.getBean("empA",Employee.class);
//		bean.setName("Rahul");
		
		System.out.println(bean);
		
		ioc.registerShutdownHook();
		
	}

}

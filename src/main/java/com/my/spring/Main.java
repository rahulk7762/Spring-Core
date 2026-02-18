package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc = new ClassPathXmlApplicationContext("InnerBean.xml");
		
		Employee bean = ioc.getBean("emp",Employee.class);
		
		System.out.println(bean);
		
		bean.getAddress().setCity("Palwal");
		
		System.out.println(bean);
	}

}

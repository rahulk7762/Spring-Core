package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.spring.model.Child;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ioc = new ClassPathXmlApplicationContext("parent_child.xml");
		
		Child bean =  ioc.getBean("child",Child.class);

		
		System.out.println(bean);
	}

}

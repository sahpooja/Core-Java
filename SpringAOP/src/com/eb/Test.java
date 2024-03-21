package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		
		Swiggy t= (Swiggy)context.getBean("sw");
		
		System.out.println("Calling Method");
		t.starterMenu();
		t.vegMenu();
		t.nonvegMenu();

	}

}

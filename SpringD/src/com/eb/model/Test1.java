package com.eb.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 
{
    public static void main(String []args)
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
    	Student stud= (Student)context.getBean("s1");
    	
    	stud.disp();
    }
}

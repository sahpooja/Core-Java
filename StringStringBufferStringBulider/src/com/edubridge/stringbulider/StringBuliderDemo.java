package com.edubridge.stringbulider;

public class StringBuliderDemo {

	public static void main(String[] args)
	{
		StringBuilder b= new StringBuilder("Shiwani is the Java Full Stack Trainer");
		System.out.println(b);
		System.out.println(b.capacity());
		
		StringBuilder b1= new StringBuilder("I am From");
		System.out.println(b1);
		System.out.println(b1.capacity());
		
		System.out.println(b1.append(" India"));//-------append method
		
		b.setCharAt(20, '&');//-------setCharAt method
		System.out.println(b);
		


	}

}

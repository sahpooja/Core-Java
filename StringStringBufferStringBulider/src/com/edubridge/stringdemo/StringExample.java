package com.edubridge.stringdemo;

public class StringExample {

	public static void main(String[] args) 
	{
		//by using string literal
		String s1= "EduBridge";
		String s2= "EduBridge";
		// by using new keyword
		String s3= new String("EduBridge");
		String s4= new String("EduBridge");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s4));

	}

}

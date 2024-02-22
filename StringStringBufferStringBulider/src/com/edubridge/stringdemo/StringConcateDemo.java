package com.edubridge.stringdemo;

import java.util.Scanner;

public class StringConcateDemo {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String str1=s.next();
		String str2=new String(s.next());
		System.out.println(str1.concat(str2));
		
		System.out.println(20+50+"hello"+80+60);
		System.out.println(20+"hello"+80);

	}

}

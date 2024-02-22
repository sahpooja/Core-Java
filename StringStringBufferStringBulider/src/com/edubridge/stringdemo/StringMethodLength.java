package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodLength {

	public static void main(String[] args) 
	{
		String s1= "Nia Sharma";
		String s2=" ";
		System.out.println(s1.length());
		//to convent a string into character array
		char[]arr=new char[10];
		s1.getChars(0,10,arr,0);
		System.out.println(Arrays.toString(arr));
		System.out.println(s1.compareTo("nia shaRma"));
		System.out.println(s1.compareTo("Nia Sharma"));
		System.out.println(s1.compareToIgnoreCase("nia sharma"));
		System.out.println(s2.isEmpty());
		//System.out.println(s2.isBlank());
		System.out.println(s1.charAt(4));
		System.out.println("het Guy's, yor are awesome".startsWith("he"));
		System.out.println("het Guy's, yor are awesome".endsWith("som"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("The Karan Luthra".trim());

	}

}

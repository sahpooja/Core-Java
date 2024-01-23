package com.eubridge.cmile;

import java.util.Scanner;

public class CharDataType {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		String x= s.next();
		boolean y= false;
		char z= s.next().charAt(0);
		
		System.out.println("the value of String is: "+x);
		System.out.println(y);
		System.out.println("the value of Character is: "+z);
	

	}

}

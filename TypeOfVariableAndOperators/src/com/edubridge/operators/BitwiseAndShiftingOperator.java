package com.edubridge.operators;

import java.util.Scanner;
// program on bitwise and shifting operator

public class BitwiseAndShiftingOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a= s.nextInt();
		int b=s.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a>>b);
		System.out.println(a<<b);

	}

}

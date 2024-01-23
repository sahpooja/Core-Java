package com.eubridge.cmile;

import java.util.Scanner;

public class FloartingPNtDataType {

	public static void main(String[] args)
	{
        Scanner s= new Scanner(System.in);
		
		float x= s.nextFloat();
		double y=s.nextDouble();
		
		System.out.println("the value of Float is: "+x);
		System.out.println("the value of Double is: "+y);

		s.close();
	}

}

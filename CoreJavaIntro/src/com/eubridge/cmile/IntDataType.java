package com.eubridge.cmile;

import java.util.Scanner;

public class IntDataType 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		byte num= s.nextByte();
		short x=s.nextShort();
		int y=s.nextInt();
		long z=s.nextLong();
		
		System.out.println("The byte num value is:"+num);
		System.out.println("The short x value is:"+x);
		System.out.println("The int y value is:"+y);
		System.out.println("The long z value is:"+z);
		s.close();
	}
}

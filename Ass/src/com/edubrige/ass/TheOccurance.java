package com.edubrige.ass;

import java.util.Scanner;

public class TheOccurance {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.replaceAll("the", " ");
		a=a.substring(0,a.length());
		System.out.println(a);

	}

}

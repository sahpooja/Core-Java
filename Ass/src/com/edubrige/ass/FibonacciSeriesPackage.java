package com.edubrige.ass;

import java.util.Scanner;

public class FibonacciSeriesPackage {

	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int a=0, b=1;
		System.out.println(a+" "+b+" ");
		
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			a=b;
			b=c;
		
			System.out.print(c+" ");
		}
		

	}

}

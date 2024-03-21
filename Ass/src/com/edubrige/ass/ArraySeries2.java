package com.edubrige.ass;

import java.util.Scanner;

public class ArraySeries2 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int sum=6;
		
		for(int i=0;i<n;i++)
		{
			sum= sum+5*i;
         System.out.print(sum+" ");
		}
	}

}

package com.edubrige.ass;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=2*n;
		
		for(int i=1;i<=num;i=i+2)
		{
			for(int j=i;j<=num;j=j+2)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}

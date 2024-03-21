package com.edubridge.runtime;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				c++;
				if((i+j)%2==0)
				{
					System.out.print(1);
				}
					else
					{
						System.out.print(0);
					}
				
			}
			System.out.println();
		}

	}

}

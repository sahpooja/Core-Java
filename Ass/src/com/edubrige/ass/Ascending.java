package com.edubrige.ass;

public class Ascending {

	public static void main(String[] args) 
	{
		int arr[]= new int[]{1,3,2,9,7};
		int n=0;
		System.out.println("Enter the Element: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					n=arr[i];
					arr[i]=arr[j];
					arr[j]=n;
				}
			}
		}
		System.out.println();
		
		System.out.println("The Ascending elements:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

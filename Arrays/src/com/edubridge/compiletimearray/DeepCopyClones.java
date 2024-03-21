package com.edubridge.compiletimearray;

public class DeepCopyClones {
// program demonstrate on deep copy
	public static void main(String[] args) 
	{
		int arr1[]= {2,11,67,43,5};
		int arr2[]=arr1.clone();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		

	}

}

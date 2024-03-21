package com.edubridge.compiletimearray;

public class ShallowCopy {

	public static void main(String[] args)
	{
		int arr1 [][]= {{1,20},{22,7}};
			int arr2 [][]=arr1.clone();
			
			for(int i=0;i<arr2.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					System.out.print(arr2[i][j]+" ");
				}
				System.out.println();
			}
		

	}

}

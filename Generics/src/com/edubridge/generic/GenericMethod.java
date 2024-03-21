package com.edubridge.generic;

public class GenericMethod {

	public static <E>void accept(E[]arr)
	{
		for(E itr:arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Integer[] arr1= {55,4,67,88};
		String[] arr2= {"Rhea","Tammana","Nyana","Sapna"};
		System.out.println("Frist Array is: ");
		GenericMethod.accept(arr1);
		
		System.out.println("Second Array is: ");
		GenericMethod.accept(arr2);

	}

}

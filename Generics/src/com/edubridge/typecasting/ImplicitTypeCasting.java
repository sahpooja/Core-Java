package com.edubridge.typecasting;

public class ImplicitTypeCasting {

	public static void main(String[] args) 
	{//implicit or widening type casting
		//smaller to larger data type size
		char c='c';
		int num=c;
		System.out.println(num);
		
		//explicit or narrowing type casting
		//larger to smaller data type size
		int num1=63;
		char x= (char) num1;
		System.out.println(x);

	}

}

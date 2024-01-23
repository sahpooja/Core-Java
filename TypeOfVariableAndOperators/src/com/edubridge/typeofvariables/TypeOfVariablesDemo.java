package com.edubridge.typeofvariables;

public class TypeOfVariablesDemo {
	float salary= 78900.56f;
	
	static int x=10;
	
	String display()
	{
		char y='z';
		return "Local Variable";		
		}

	public static void main(String[] args)
	{
		System.out.println(x);
		TypeOfVariablesDemo obj=new TypeOfVariablesDemo();
		System.out.println(obj.display());
		System.out.println(obj.salary);
	}

}

package com.edubridge.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericAdvantageDemo {

	public static void main(String[] args) 
	{
		// 1. Type safety
		List <String> obj=new ArrayList<>();
		// it ensure that to add only string values
		// 3.compile type checking
		//obj.add(11);
		obj.add("11");
		obj.add("Shiwani");
		
		//2. type casting is not required
		//List obj1 =new ArrayList<>();
		List<String> obj1 =new ArrayList<>();
		obj1.add("Shiwani");
		obj1.add("Shifa");
		/*without generic, type casting is required*/
		//String str1=(String) obj1.get(0);
		String str1 =obj1.get(1);
		System.out.println(str1);

}

}

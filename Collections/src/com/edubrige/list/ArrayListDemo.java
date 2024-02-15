package com.edubrige.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		/* we cannot create the object for collection because it is a interface*/
		//Collection<String>obj= new Collection<>();
		
		
		List<String>obj= new ArrayList<>();
		obj.add("Devyani");
		obj.add("Yukta");
		obj.add("Sakshi");
		System.out.println(obj);
		
		
		List<Object>obj1= new ArrayList<>();
		obj1.add("Devyani");
		obj1.add(10);
		obj1.add(70.5);
		System.out.println(obj1);
		
		List<String>obj2= new ArrayList<>();
		obj2.addAll(obj);
		System.out.println(obj2);
		System.out.println(obj1.get(1));
		obj2.remove(1);
		System.out.println(obj2);
		
	}

}

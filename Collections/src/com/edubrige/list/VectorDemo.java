package com.edubrige.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		List<Object> obj= new Vector<>();
		obj.add(12);
		obj.add("pooja");
		obj.add(75.00000);
		obj.add('p');
		obj.add(true);
		System.out.println(obj);
		
	}

}

package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		Map<Integer,String> obj= new HashMap<>();
		obj.put(1,"Shreyash");
		obj.put(2,"Atul");
		obj.put(1,"Durvesh");
		obj.put(1,"Niraj");
		System.out.println(obj);
		System.out.println(obj.containsKey(5));
		//System.out.println(obj.remove(1));
		
		/*it removes entire of key 1*/
		obj.remove(1,"Niraj");
		System.out.println(obj);
	

	}

}

package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
/*HashMap keys are arrange in ascending order wise and Hashtable keys are arrange in descending order wise*/
	public static void main(String[] args) 
	{
		Map<Integer, Object> obj= new Hashtable<>();
		obj.put(1, "Sheryash");
		obj.put(5, "Atul");
		obj.put(1, "Sherya");
		/* we cannot use key and value as 'null' else we will get an null pointer exception*/
		//obj.put(4, null);
		System.out.println(obj);

	}

}

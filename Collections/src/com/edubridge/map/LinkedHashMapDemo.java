package com.edubridge.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) 
	{
		Map<Integer, Object> obj= new LinkedHashMap<>();
		obj.put(1, "Sheryash");
		obj.put(5, "Atul");
		obj.put(1, "Sherya");
		obj.put(4, null);
		System.out.println(obj);
        
        for(Map.Entry<Integer, Object> itr:obj.entrySet())
        {
        	System.out.println(itr.getKey()+" "+itr.getValue());
        }



	}

}

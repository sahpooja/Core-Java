package com.edu.stream;

import java.util.Arrays;
import java.util.List;
//program to demonstrated on Map 
public class MapDemo {

	public static void main(String[] args)
	{
		List<String>obj=Arrays.asList("Shifa","Preeti","Pooja");
		obj.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));

	}

}

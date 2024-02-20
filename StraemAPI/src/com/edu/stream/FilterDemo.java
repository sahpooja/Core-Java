package com.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//program to demonstrate on Filter
public class FilterDemo {

	public static void main(String[] args) 
	{
		List<String>obj=Arrays.asList("Shifa","Preeti","Pooja");
		obj.stream().filter(i->i.length()>5)
		.forEach(i->System.out.println(i));
		
		Stream<Integer>obj1 =Stream.of(11,4,67,89);
		System.out.println(obj1.count());
		
		obj.stream().limit(2)
		.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		obj.stream().skip(1)
		.forEach(i->System.out.print(i+" "));

	}

}

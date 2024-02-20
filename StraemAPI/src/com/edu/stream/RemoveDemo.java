package com.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDemo {

	public static void main(String[] args) 
	{
		List<String>obj=Arrays.asList("","Shifa","Preeti","Pooja");
		// remove all the empty string
		List<String> res=obj.stream().filter(i->!i.isEmpty())
		.collect(Collectors.toList());
		System.out.println(res);

	}

}

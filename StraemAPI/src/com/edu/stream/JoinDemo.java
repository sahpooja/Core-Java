package com.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinDemo {

	public static void main(String[] args) 
	{
		List<String>obj=Arrays.asList("Shifa","Preeti","Pooja");
		String res=obj.stream().map(i->i.toUpperCase())
				.collect(Collectors.joining(","));
		System.out.println(res);

	}

}

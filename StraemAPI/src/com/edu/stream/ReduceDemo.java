package com.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(4,56,78,99);
		Optional<Integer>res=obj.stream().reduce((x,y)->x*y);
		
		if(res.isPresent())
			System.out.println(res.get());
			else
				System.out.println("Not Present");

	}

}

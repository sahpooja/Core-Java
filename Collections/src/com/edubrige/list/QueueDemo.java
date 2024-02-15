package com.edubrige.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) 
	{
		Queue<Integer> q1= new PriorityQueue<>();
		q1.add(15);
		q1.add(11);
		q1.add(5);
		q1.add(1);
		System.out.println(q1+" ");
		for(int i:q1)
		{
			System.out.print(i+" ");
		}

	}

}

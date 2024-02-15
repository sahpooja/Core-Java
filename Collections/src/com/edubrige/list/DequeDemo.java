package com.edubrige.list;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) 
	{
		Deque<Integer>d= new LinkedList<>();
		d.add(15);
		d.add(11);
		d.add(10);
		d.add(17);
		System.out.println(d+" ");
		
		d.addFirst(1);
		System.out.println(d);
		
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		
		/*d.pollLast();
		d.pollLast();
		d.pollLast();
		d.pollLast();*/
		
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		
		System.out.println(d);

	}

}

package com.edubridge.synchronize;

public class StaticSynchronizedExecutor {

	public static void main(String[] args) 
	{
		 StaticSynchronized w1=new  StaticSynchronized ();
		 MyThread m1= new MyThread(w1);
		 MyThread m2= new MyThread(w1);
		 m2.setPriority(2);
		 m1.setPriority(10);
		 m1.start();
		 m2.start();

	}

}

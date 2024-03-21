package com.edubridge.synchronize;

public class SynchronizedMethod {

	public synchronized void print(int num) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}

	}

}

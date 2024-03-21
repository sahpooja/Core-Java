package com.edubridge.synchronize;

public class Flat 
{
	public void print(int num)
	{
		//3.Synchronized block
		synchronized(this)
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

}

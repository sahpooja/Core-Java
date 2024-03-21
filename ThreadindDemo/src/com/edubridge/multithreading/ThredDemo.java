package com.edubridge.multithreading;
//1. Creating a Thread by extending Thread Class
public class ThredDemo extends Thread
{
  public void run()
  {
	  /*currentThread() will give a current executing Thread name*/
	  System.out.println("Thread is in the Running State: "+Thread.currentThread());
  }
	public static void main(String[] args) 
	{
		for(int i=1; i<4;i++)
		{
		ThredDemo t1= new ThredDemo();
		ThredDemo t2= new ThredDemo();
		
		/* when we call start() automatically it calls to the run()*/
		t1.start();
		t2.start();
		}
	}

}

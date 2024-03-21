package com.edubridge.synchronize;

public class MyThread extends Thread
{
     StaticSynchronized w;
     
     public MyThread( StaticSynchronized w)
     {
    	 super();
    	 this.w=w;
     }
     public void run()
     {
    	 //To access static method use ClassName.methodName();
    	 StaticSynchronized.display(getName());
     }
}

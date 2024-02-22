package com.edubridge.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		         //* String Buffer Method *//
		
		
		//StringBuffer b= new StringBuffer("shiwani");
		//System.out.println(b.capacity());
		String str="Edu Bridge";
		//StringBuffer b1= new StringBuffer(str.length());
		//System.out.println(b1.capacity());
		
		StringBuffer b2= new StringBuffer("Internet of Things");
		System.out.println(b2.capacity()); //34
		b2=new StringBuffer("EduBridge");
		System.out.println(b2.capacity()); //17
		
		        //* append method *//
		
		/*as string is immutable we can't do 
		 * modification
		 */
		//System.out.println(str.append(" India"));
		System.out.println(b2.append(" India"));
		
		          //* SetCharAt method *//
		
		StringBuffer sb= new StringBuffer("JAVA");
		System.out.println(sb);
		sb.setCharAt(1, 'a');
		System.out.println(sb);
		
		System.out.println(b2.append(" India"));
		  // out of boundry error
		//b2.setCharAt(26, 'z');
		System.out.println(b2);

	}

}

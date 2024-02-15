package com.edubridge.regularexpression;

public class StringMethodDemo {

	public static void main(String[] args) 
	{
		String str="hey, Sakshi, Akshay, Priti";
		String[] res= str.split(",");
		for(String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
        String str1="There are 5 members in my family";
        String regex="\\d+";
        String res1=str1.replaceAll(regex, "five");
        System.out.println(res1);
	}

}

package com.edubridge.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) 
	{
		String input="8 tv price 4";
		String regex ="(.*)(\\d+)(.*)(\\d)";
		
		Pattern p= Pattern.compile(regex);
		Matcher matcher = p.matcher(input);
		
		
		System.out.println(matcher.matches());

	}

}

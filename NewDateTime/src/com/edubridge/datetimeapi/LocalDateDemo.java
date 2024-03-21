package com.edubridge.datetimeapi;
//program to demonstrated on LocalDate, LocalDateTime and LocalTime
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) 
	{
		LocalDate d= LocalDate.now();
		System.out.println("The Current Date is: "+d);
		
		LocalTime t= LocalTime.now();
		System.out.println("The Current Time is: "+t);
		
		LocalDateTime l= LocalDateTime.now();
		System.out.println("The Current Date and Time is: "+l);

	}

}

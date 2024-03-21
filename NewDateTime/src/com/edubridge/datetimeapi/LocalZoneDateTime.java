package com.edubridge.datetimeapi;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZoneDateTime {

	public static void main(String[] args) 
	{
		ZonedDateTime z= ZonedDateTime.now();
		System.out.println(z);
		
		OffsetTime o= OffsetTime.now();
		System.out.println(o);
		
		OffsetDateTime o1= OffsetDateTime.now();
		System.out.println(o1);
		
		ZoneId i= ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		
		ZoneOffset z1= ZoneOffset.ofHoursMinutes(11, 20);
		System.out.println(z1);
		
		String str="2020-12-04 12:30";
		DateTimeFormatter tr= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime t1= LocalDateTime.parse(str,tr);
		System.out.println(t1);

	}

}

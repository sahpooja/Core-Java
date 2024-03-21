package com.edubridge.oopsdemo;
//child class
public class Football extends Sports{
	@Override
	public void play(String SportName, int TotalMember) {
		SportName="Football";
		TotalMembers=10;
		System.out.println(SportName+" "+TotalMembers);
	}

}

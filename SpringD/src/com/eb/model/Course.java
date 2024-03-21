package com.eb.model;

public class Course 
{
      private int cid;
      private String cname;
      private int duration;
      private int fees;
	@Override
	public String toString()
	{
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
	public Course(int cid, String cname, int duration, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}     
}

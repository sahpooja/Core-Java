package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.eb.database.CP;
import com.ed.pojo.Student;

public class StudentDao 
{
    public static boolean insertStudentData(Student s)
    {
    boolean f=false;
    try
    {
    	Connection con=CP.create();
    	String query="insert into student(Name,Contact,City) values(?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setString(1,s.getStudentName());
		ps.setString(2,s.getStudentContact());
		ps.setString(3,s.getStudentCity());
		ps.executeUpdate();
		f=true;	
    }
    catch (Exception e)
	{
		e.printStackTrace();
	}
		return false;
    	
    }
    public static boolean updateStudentData(int val, String toUpdate,int Id, Student s)
    { 
      boolean f=false;
      try 
    {
    	Connection con=CP.create();
    	if(val==1)
    	{
    		//update name
    		String query="update student set Name=? where Id=?";
    		PreparedStatement ps= con.prepareStatement(query);
    		ps.setString(1, toUpdate);
    		ps.setInt(2, Id);
    		ps.executeUpdate();
    		f=true;	
    	}
    	else if(val==2)
    	{
    		//update Contact
    		String query="update student set Contact=? where Id=?";
    		PreparedStatement ps= con.prepareStatement(query);
    		ps.setString(1, toUpdate);
    		ps.setInt(2, Id);
    		ps.executeUpdate();
    		f=true;	
    	}
    	else if(val==3)
    	{
    		//update City
    		String query="update student set City=? where Id=?";
    		PreparedStatement ps= con.prepareStatement(query);
    		ps.setString(1, toUpdate);
    		ps.setInt(2, Id);
    		ps.executeUpdate();
    		f=true;	
    	}
    	else
    	{
    		System.out.println("Invalid");
    	}
    	
    }
    catch (Exception e)
	{
		e.printStackTrace();
	}
		return false;
    	
    }
    
    public static boolean deleteStudentData(int userId)
    {
    	boolean f=false;
    	try
    	{
    		Connection con=CP.create();
    		String query="delete from student where Id=?";
    		PreparedStatement ps= con.prepareStatement(query);
    		ps.setInt(1, userId);
    		ps.executeUpdate();
    		f=true;
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
		return false;  	
    }
    
    public static void showAllStudentData()
    {
    	boolean f=false;
    	try 
    	{
    		Connection con=CP.create();
    		String query="select * from student";
    		Statement stmt=con.createStatement();
    		ResultSet rs=stmt.executeQuery(query);
    		
    		while(rs.next())
    		{
    			int Id=rs.getInt(1);
    			String Name= rs.getString(2);
    			String Contact= rs.getString(3);
    			String City= rs.getString(4);
    			
    			System.out.println("Student ID: "+Id+"/nStudent Name: "+Name+"/nStudent Contact No: "
    					+Contact+"/n Student City: "+City);
    		}
    		
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
}

package com.eb.singletone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertSingletone 
{
    private static InsertSingletone jdbc;
    private InsertSingletone() { }
    public static InsertSingletone getInstance()
    {
    	if(jdbc==null)
    	{
    		jdbc=new InsertSingletone();
    	}
		return jdbc;	
    }
    private static Connection getConnection() throws ClassNotFoundException, SQLException
    {   Connection con=null;
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton","root","root");
		return con;    	
    }
    public int insert(String name, String pass, int id) throws SQLException
    {
    	Connection c=null;
    	PreparedStatement ps=null;
    	int recordCounter=0;
    	try {
    		c=this.getConnection();
    		ps=c.prepareStatement("insert into Employee(Eid,Eusername,Password)values(?,?,?)");
    		ps.setInt(1, id);
    		ps.setString(2,name);
    		ps.setString(3,pass);
    		recordCounter=ps.executeUpdate();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		if(ps!=null)
    		{
    			ps.close();
    		}
    		if(c!=null)
    		{
    			c.close();
    		}
    	}
		return recordCounter;
    }
  
public void view() throws SQLException
{
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		conn=this.getConnection();
		ps=conn.prepareStatement("select * from Employee");
		
		rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("ID "+rs.getInt(1)+"Name"+rs.getString(2)+"Password"+rs.getString(3));
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(rs!=null)
		{
			rs.close();
		}
		if(ps!=null)
		{
			ps.close();
		}
		if(conn!=null) 
		{
			conn.close();
		}
	}
}
	
public int update(String name, String password, int id) throws SQLException
{
	Connection c=null;
	PreparedStatement ps=null;
	int recordCounter=0;
	try {
		c=this.getConnection();
		ps=c.prepareStatement("update Employee set Eusername=?, Password=? where Eid=?");
		ps.setString(1, name);
		ps.setString(2,password);
		ps.setInt(3, id);
		recordCounter=ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(ps!=null)
		{
			ps.close();
		}
		if(c!=null)
		{
			c.close();
		}
	}
	return recordCounter;
}

public int delete(int userid) throws SQLException
{
	Connection c=null;
	PreparedStatement ps=null;
	int recordCounter=0;
	try {
		c=this.getConnection();
		ps=c.prepareStatement("delete from Employee where Eid='"+userid+" ' ");
		recordCounter=ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(ps!=null)
		{
			ps.close();
		}
		if(c!=null)
		{
			c.close();
		}
	}
	return recordCounter;
  }
 }





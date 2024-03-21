package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PreparedStmtDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//step:1 load and register driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step:2 Established the connection
		String url="jdbc:mysql://localhost:3306/jdbc1";
		String un="root";
		String pw="root";
		
		//step:3 connect the database
		Connection con=DriverManager.getConnection(url,un,pw);
		
		//step:4 inserting record using preparedstatement()
		String sql="insert into user(Id,Name,Location)values(?,?,?)";
		
		/*PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, 101);
		ps.setString(2,"Pooja");
		ps.setString(3,"Sion");
		
		int i=ps.executeUpdate();*/
		
		//callable statement
		CallableStatement cs=(CallableStatement) con.prepareCall(sql);
		
		cs.setInt(1, 102);
		cs.setString(2,"Simi");
		cs.setString(3, "Pune");
		cs.execute();
		
		System.out.println("Data update successfully.....");

	}

}

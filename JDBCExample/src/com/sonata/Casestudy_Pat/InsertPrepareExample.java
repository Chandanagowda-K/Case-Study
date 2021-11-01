package com.sonata.Casestudy_Pat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepareExample {

	public static void main(String[] args) {
		
	try {
		 Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/CSProject", "root","admin@123");
		
		PreparedStatement ps = con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?)");
		  ps.setInt(1, 01);
		  ps.setString(2,"Sam");
		  ps.setInt(3,20);
		  ps.setString(4,"male");
		  ps.setString(5,"sam@gmail.com");
		  ps.setInt(6,2345);
		  ps.setString(7,"O+");
		int a = ps.executeUpdate();
		System.out.println("The number of records updated are" + a);
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}

			}

		}


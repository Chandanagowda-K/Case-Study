package com.sonata.CaseStudy;

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

	PreparedStatement ps = con.prepareStatement("insert into Doctor values(?,?,?,?,?)");
	  ps.setInt(1, 3);
	  ps.setString(2,"Ram");
	  ps.setString(3,"Dermatologist");
	  ps.setString(4,"r1@gmail.com");
	  ps.setInt(5,9874);
	int a = ps.executeUpdate();
	System.out.println("The number of records updated are" + a);
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
	catch(SQLException e2) {e2.printStackTrace();}

		}

	}


package com.sonata.CaseStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePrepareExample {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/CSProject", "root","admin@123");

	PreparedStatement ps = con.prepareStatement
			("delete from  Doctor  where dr_id=?");
	ps.setInt(1, 2);

	int a = ps.executeUpdate();
	System.out.println("The record deleted  are" + a);
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
	catch(SQLException e2) {e2.printStackTrace();}
		}
}


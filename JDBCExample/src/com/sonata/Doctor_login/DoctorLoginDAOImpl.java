package com.sonata.Doctor_login;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorLoginDAOImpl implements DoctorLoginDao{
	int row =0;
	DbConnection db = new DbConnection();
	DocLogin doclogin = null;
	
	public int save(Object object) throws ClassNotFoundException{
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			doclogin = (DocLogin)object;
			CallableStatement cs = con.prepareCall("{call DocLogin(?,?)}");
			cs.setInt(1,doclogin.getDr_id());
			cs.setInt(2,doclogin.getPassword());
			
			
			row = cs.executeUpdate();
			db.closeConnection();
					
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
		return row;
	}

}

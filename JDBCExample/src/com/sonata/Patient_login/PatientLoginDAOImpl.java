package com.sonata.Patient_login;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PatientLoginDAOImpl implements PatientLoginDao {
    
	int row =0;
	PatLogin patlogin = null;
	
	public int save(Object object) throws ClassNotFoundException{
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			patlogin = (PatLogin)object;
			CallableStatement cs = con.prepareCall("{call PatLogin(?,?)}");
			cs.setInt(1,patlogin.getPat_id());
			cs.setInt(2,patlogin.getPassword());
			
			
			row = cs.executeUpdate();
			
					
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
		return row;
	}

}
	
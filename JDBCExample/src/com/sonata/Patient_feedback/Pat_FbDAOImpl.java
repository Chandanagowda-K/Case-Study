package com.sonata.Patient_feedback;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.PreparedStatement;

public class Pat_FbDAOImpl implements Pat_FbDao{

	     
	int row =0;
	
	PatientFb patientfb = null;
	
	public int save(Object object) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			
			patientfb = (PatientFb)object;
			CallableStatement cs = con.prepareCall("call patientfb values(?,?,?,?,?)}");
			cs.setInt(1, patientfb.getDr_id());
			cs.setInt(2, patientfb.getPat_id());
			cs.setString(3, patientfb.getFeedback());
			cs.setInt(4, patientfb.getFeedback_id());
		    cs.setDate(5, patientfb.getDate());
			
		    row = cs.executeUpdate();
			
		    
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}
	return row;

	}

}

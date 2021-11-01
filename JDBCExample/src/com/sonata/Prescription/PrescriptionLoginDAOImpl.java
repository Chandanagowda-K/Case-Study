package com.sonata.Prescription;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrescriptionLoginDAOImpl implements PrescriptionDao {
    
	int row =0;
	PrescriptionForDis prescriptionfordis = null;
	
	public int save(Object object) throws ClassNotFoundException{
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			prescriptionfordis = (PrescriptionForDis)object;
			CallableStatement ps = con.prepareCall("{call PrescriptionForDis(?,?)}");
			ps.setInt(1,prescriptionfordis.getSlot_id());
			ps.setString(2,prescriptionfordis.getPrescription());
			
			
			row = ps.executeUpdate();
			
					
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
		return row;
	}

}



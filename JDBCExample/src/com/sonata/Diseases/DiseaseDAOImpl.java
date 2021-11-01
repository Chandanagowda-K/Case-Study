package com.sonata.Diseases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DiseaseDAOImpl implements DiseaseDao {

	int row =0;
	DiseaseName diseasename = null;
	
	public int save(Object object) throws ClassNotFoundException{
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			diseasename = (DiseaseName)object;
			CallableStatement ps = con.prepareCall("{call DiseaseName (?,?)}");
			ps.setInt(1,diseasename.getDis_id());
			ps.setString(2,diseasename.getDis_name());
			
			
			row = ps.executeUpdate();
			
					
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
		return row;
	}

}
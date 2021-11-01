package com.sonata.Dao_Pat;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PatientDAOImpl implements PatientDao{
	int row =0;
	DbConnection db = new DbConnection();
	Patient patient = null;
	
	public int save(Object object) {
		try {
			
			patient = (Patient)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("insert into Patient values(?,?,?,?,?,?,?)");
			cs.setInt(1,patient.getPat_id());
			cs.setString(2,patient.getName());
			cs.setInt(3,patient.getAge());
			cs.setString(4,patient.getSex());
			cs.setString(5,patient.getE_mail());
			cs.setInt(6,patient.getPhone_number());
			cs.setString(7,patient.getBlood_group());
			
			row = cs.executeUpdate();
			db.closeConnection();
					
		}catch(SQLException e) {System.out.println(e);}
		return row;
	}

}


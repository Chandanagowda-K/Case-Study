package com.sonata.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDao{
	int row =0;
	DbConnection db = new DbConnection();
	Doctor doctor = null;
	
	public int save(Object object) {
		try {
			
			doctor = (Doctor)object;
			PreparedStatement cs = db.getConnection().prepareStatement
					("insert into Doctor values(?,?,?,?,?)");
			cs.setInt(1,doctor.getDr_id());
			cs.setString(2,doctor.getDr_name());
			cs.setString(3,doctor.getSpecialization());
			cs.setString(4,doctor.getE_mail());
			cs.setInt(5,doctor.getPhone_number());
			row = cs.executeUpdate();
			db.closeConnection();
					
		}catch(SQLException e) {System.out.println(e);}
		return row;
	}




@Override
public List<Doctor>getData(){
	List<Doctor>doctorList = new ArrayList<>();
	
	try {
		PreparedStatement cs = db.getConnection().prepareStatement
				("SELECT * FROM Doctor ");
		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			Doctor doc = new Doctor ();
			doc.setDr_id (rs.getInt("dr_id"));
			doc.setDr_name (rs.getString("dr_name"));
			doc.setSpecialization(rs.getString("specialization"));
			doc.setE_mail(rs.getString("e_mail"));
			doc.setPhone_number (rs.getInt("phone_number"));
			
			doctorList.add(doc);
		}
			
		}catch(SQLException e) {e.printStackTrace();}
	return (List<Doctor>) doctor;
	}
}
	
	
	
	
	
	
	
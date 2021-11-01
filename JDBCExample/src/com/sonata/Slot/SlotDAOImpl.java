package com.sonata.Slot;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SlotDAOImpl implements SlotDao{

	     
	int row =0;
	Slot slot = null;
	
	public int save(Object object) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CSProject","root" ,"admin@123");
			
			slot = (Slot)object;
			CallableStatement cs = con.prepareCall("call slot values(?,?,?,?,?,?,?)}");
			cs.setInt(1, slot.getDr_id());
			cs.setInt(2, slot.getPat_id());
			cs.setInt(3,slot.getDis_id());
		    cs.setDate(4, slot.getDate());
		    cs.setTime(5, slot.getStart_time());
		    cs.setTime(6, slot.getEnd_time());
		    cs.setInt(7, slot.getSlot_id());
			
		    row = cs.executeUpdate();
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}
	return row;

	}

}
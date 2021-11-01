package com.sonata.Prescription;

import java.sql.SQLException;

public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		PrescriptionForDis e1 = new PrescriptionForDis();
		e1.setSlot_id(1);
	    e1.setPrescription("Painkiller");
	
	    PrescriptionLoginDAOImpl dao = new PrescriptionLoginDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}
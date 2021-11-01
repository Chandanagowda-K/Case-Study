package com.sonata.Patient_feedback;

import java.sql.SQLException;
import java.sql.Date;

import com.sonata.Slot.SlotDAOImpl;


public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		PatientFb e1 = new PatientFb();
		e1.setDr_id(1);
	    e1.setPat_id(2);
	    e1.setFeedback("good");
	    e1.setFeedback_id(1);
	    e1.setDate(2-3-21);
	
	   SlotDAOImpl dao = new SlotDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}

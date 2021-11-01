package com.sonata.Patient_login;

import java.sql.SQLException;


public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		PatLogin e1 = new PatLogin();
		e1.setPat_id(1);
	    e1.setPassword(001);
	
	     PatientLoginDAOImpl dao = new PatientLoginDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}

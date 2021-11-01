package com.sonata.Doctor_login;

import java.sql.SQLException;

public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DocLogin e1 = new DocLogin();
		e1.setDr_id(1);
	    e1.setPassword(001);
	
	     DoctorLoginDAOImpl dao = new DoctorLoginDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}

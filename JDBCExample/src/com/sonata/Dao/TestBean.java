package com.sonata.Dao;

import java.sql.SQLException;
import java.util.List;

public class TestBean {

	public static void main(String[] args) throws SQLException {
		Doctor d1 = new Doctor();
		d1.setDr_id(1);
		 d1.setDr_name("RAM");
	      d1.setSpecialization("Cardiologist");
		   d1. setE_mail("doc@gmail.com");
		  d1. setPhone_number(9876);
		  
		  DoctorDAOImpl dao = new DoctorDAOImpl();
		  int row = dao.save(d1);
		  
		  System.out.println(row);
		
		  List<Doctor>List = dao.getData();
		   for(Doctor e:List) {
			   System.out.println(e.getDr_id());
			   System.out.println(e.getDr_name());
			   System.out.println(e.getSpecialization());
			   System.out.println(e.getE_mail());
			   System.out.println(e.getPhone_number());
		   }
	}

}

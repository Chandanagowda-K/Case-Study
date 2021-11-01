package com.sonata.Dao_Pat;

import java.sql.SQLException;

public class TestBean {

	public static void main(String[] args) throws SQLException {
		Patient d1 = new Patient();
		d1.setPat_id(1);
		 d1.setName("SAM");
		 d1.setAge(20);
	      d1.setSex("male");
		   d1. setE_mail("sam@gmail.com");
		  d1. setPhone_number(2345);
		  d1.setBlood_group("O+");
		  
		  PatientDAOImpl dao = new PatientDAOImpl();
		  int row = dao.save(d1);
		  
		  //update
		  //int row = dao.update(e1);
		  
		  //delete
		  //int row = dao.delete(e1);
		  
		  System.out.println(row);
		
	}

}

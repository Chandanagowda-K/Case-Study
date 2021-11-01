package com.sonata.Diseases;

import java.sql.SQLException;

public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DiseaseName e1 = new DiseaseName();
		e1.setDis_id(1);
	    e1.setDis_name("COLD");
	
	    DiseaseDAOImpl dao = new DiseaseDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}
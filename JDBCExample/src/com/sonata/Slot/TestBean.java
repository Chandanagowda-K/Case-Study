package com.sonata.Slot;

import java.sql.SQLException;

import com.sonata.Slot.SlotDao;
import com.sonata.Slot.Slot;
import com.sonata.Slot.SlotDAOImpl;



public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Slot e1 = new Slot();
		e1.setDr_id(1);
		e1.setPat_id(1);
		e1.setDis_id(1);
		e1.setDate(2-4-21);
		e1.setStart_time("00:00:00");
		e1.setEnd_time("00:00:00");
		e1.setSlot_id(1);
		
		
	
	  SlotDAOImpl dao = new SlotDAOImpl();
		  int row = dao.save(e1);
		  
		  System.out.println(row);
		}
}
	

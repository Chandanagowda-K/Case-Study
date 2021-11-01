package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class  Prescription{

@Id
	
	long slotId;
	String Prescription;
	
	
	 Prescription() {}
	
	 Prescription (long slotId, String  Prescription){
		this.slotId=slotId;
		this. Prescription= Prescription;

	 }

	public long getSlotId() {
		return slotId;
	}

	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}
}








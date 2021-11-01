package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diseases {

@Id
	
	long disId;
	String disName;
	
	
	Diseases() {}
	
	Diseases (long disId, String disname){
		this.disId=disId;
		this.disName=disName;
	}

	public long getDisId() {
		return disId;
	}

	public void setDisId(long disId) {
		this.disId = disId;
	}

	public String getDisname() {
		return disName;
	}

	public void setDisname(String disname) {
		this.disName = disname;
	}
}
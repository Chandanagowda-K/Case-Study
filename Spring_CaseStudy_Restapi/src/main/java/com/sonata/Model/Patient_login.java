package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient_login {

@Id
	long patId;
	public long getPatId() {
	return patId;
}

public void setPatId(long patId) {
	this.patId = patId;
}

public double getPassword() {
	return password;
}

public void setPassword(double password) {
	this.password = password;
}

	double password;
	
	
	Patient_login () {}
	
	Patient_login (long patId, double password){
		this.patId=patId;
		this.password=password;
	}
}
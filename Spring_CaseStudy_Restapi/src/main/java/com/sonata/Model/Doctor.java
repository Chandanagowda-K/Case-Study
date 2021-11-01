package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

@Id
	
	long drId;
	String drName;
	String specialization;
	String email;
	double phonenumber;
	
Doctor() {}
	
Doctor(long id,String name,String specialization,String email, double phonenumber){
		this.drId=drId;
		this.drName=name;
		this.specialization=specialization;
		this.email=email;
		this.phonenumber=phonenumber;
		
	}

public long getDrId() {
	return drId;
}

public void setDrId(long drId) {
	this.drId = drId;
}

public String getDrName() {
	return drName;
}

public void setDrName(String drName) {
	this.drName = drName;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public double getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(double phonenumber) {
	this.phonenumber = phonenumber;
}
}

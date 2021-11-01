package com.sonata.Dao;

public class Doctor {
 private int dr_id;
 private String dr_name;
 private String specialization;
 private String e_mail;
 private int phone_number;
 
 
public int getDr_id() {
	return dr_id;
}
public void setDr_id(int dr_id) {
	this.dr_id = dr_id;
}
public String getDr_name() {
	return dr_name;
}
public void setDr_name(String dr_name) {
	this.dr_name = dr_name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}
public int getPhone_number() {
	return phone_number;
}
public void setPhone_number(int phone_number) {
	this.phone_number = phone_number;
}
}

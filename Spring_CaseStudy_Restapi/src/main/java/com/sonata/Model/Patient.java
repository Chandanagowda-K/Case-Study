package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

@Id
	
	long patId;
	String name;
	long age;
	String sex;
	String email;
	double phonenumber;
	String bloodgroup;
	
	Patient () {}
	
	Patient (long patId, String name,long age,String sex,String email,double phonenumber,String bloodgroup){
		this.patId=patId;
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.email=email;
		this.phonenumber=phonenumber;
		this.bloodgroup=bloodgroup;
	}

	public long getPatId() {
		return patId;
	}

	public void setPatId(long patId) {
		this.patId = patId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
}

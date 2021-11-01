package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor_login {

@Id
	
	long drId;
	double password;
	
	
	Doctor_login () {}
	
	Doctor_login (long drId, double password){
		this.drId=drId;
		this.password=password;
	}

	public long getDrId() {
		return drId;
	}

	public void setDrId(long drId) {
		this.drId = drId;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}
}
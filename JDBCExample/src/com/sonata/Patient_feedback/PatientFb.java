package com.sonata.Patient_feedback;

import java.sql.Date;

public class PatientFb {
	private int dr_id;
	private int pat_id;
	 private String feedback;
	 private int feedback_id;
	 private Date date;
		
	 
	public int getDr_id() {
		return dr_id;
	}
	public void setDr_id(int dr_id) {
		this.dr_id = dr_id;
	}
	public int getPat_id() {
		return pat_id;
	}
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	  
}

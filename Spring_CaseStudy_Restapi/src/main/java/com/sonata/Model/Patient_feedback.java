package com.sonata.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient_feedback {

@Id
    long drId;
	long patId;
	String Feedback;
	long FeedbackId;
	Date dateTime;
	

	
	Patient_feedback () {}
	
	Patient_feedback (long drId, long patId, String Feedback, long FeedbackId,Date dateTime){
		this.drId=drId;
	    this.patId=patId;
	    this.Feedback=Feedback;
	    this.FeedbackId=FeedbackId;
	    
}

	public long getDrId() {
		return drId;
	}

	public void setDrId(long drId) {
		this.drId = drId;
	}

	public long getPatId() {
		return patId;
	}

	public void setPatId(long patId) {
		this.patId = patId;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

	public long getFeedbackId() {
		return FeedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		FeedbackId = feedbackId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
}
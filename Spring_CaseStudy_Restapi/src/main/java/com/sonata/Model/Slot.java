package com.sonata.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slot {

@Id
    long drId;
	long patId;
    long disId;
    Date date;
	Time starttime;
	Time endtime;
	long slotId;
	 
	 
	 Slot () {}
	
	 Slot(long drId,long patId,long disId,Date date,Time starttime,Time endtime,long slotId){
		this.drId=drId;
		this.patId=patId;
		this.disId=disId;
		this.date=date;
		this.starttime=starttime;
		this.endtime=endtime;
		this.slotId=slotId;
		
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

	public long getDisId() {
		return disId;
	}

	public void setDisId(long disId) {
		this.disId = disId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStarttime() {
		return starttime;
	}

	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}

	public Time getEndtime() {
		return endtime;
	}

	public void setEndtime(Time endtime) {
		this.endtime = endtime;
	}

	public long getSlotId() {
		return slotId;
	}

	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}
}
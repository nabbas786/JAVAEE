package com.nad.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommuterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "commuter_seq")
	private int cid;
	private String comuterName;
	private String startLoc;
	private String endLoc;
	
	private Timestamp tripTime;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getComuterName() {
		return comuterName;
	}

	public void setComuterName(String comuterName) {
		this.comuterName = comuterName;
	}

	public String getStartLoc() {
		return startLoc;
	}

	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}

	public String getEndLoc() {
		return endLoc;
	}

	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}

	public Timestamp getTripTime() {
		return tripTime;
	}

	public void setTripTime(Timestamp tripTime) {
		this.tripTime = tripTime;
	}
	
	
}

package com.nad.model;

public class Commuter {

	private String comuterName;
	private String startLoc;
	private String endLoc;
	
	private String tripTime;

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

	public String getTripTime() {
		return tripTime;
	}

	public void setTripTime(String tripTime) {
		this.tripTime = tripTime;
	}

	@Override
	public String toString() {
		return "Commuter [comuterName=" + comuterName + ", startLoc=" + startLoc + ", endLoc=" + endLoc + ", tripTime="
				+ tripTime + ", getComuterName()=" + getComuterName() + ", getStartLoc()=" + getStartLoc()
				+ ", getEndLoc()=" + getEndLoc() + ", getTripTime()=" + getTripTime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

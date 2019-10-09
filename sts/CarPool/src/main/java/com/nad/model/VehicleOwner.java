package com.nad.model;

public class VehicleOwner {

	String vid;
	private String ownerName;
	private String startLoc;
	private String endLoc;
	
	public VehicleOwner() {
		super();
	}
	
	public VehicleOwner(String vid,String ownerName, String startLoc, String endLoc) {
		super();
		this.vid=vid;
		this.ownerName = ownerName;
		this.startLoc = startLoc;
		this.endLoc = endLoc;
	}
	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
	@Override
	public String toString() {
		return "VehicleOwner [ownerName=" + ownerName + ", startLoc=" + startLoc + ", endLoc=" + endLoc + "]";
	}

	
}

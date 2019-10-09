package com.nad.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "VehicleOwnerEntity")
@Table(name = "VEHICLEOWNER")
public class VehicleOwnerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "owner_seq")
    @SequenceGenerator(name = "owner_seq", sequenceName = "owner_seq", allocationSize = 1)
	int vid;
	@Column(name = "owner_Name",columnDefinition = "owner_Name")
	private String ownerName;
	@Column(name = "start_location",columnDefinition = "start_location")
	private String startLoc;
	@Column(name = "end_location",columnDefinition = "end_location")
	private String endLoc;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
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
		return "VehicleOwnerEntity [vid=" + vid + ", ownerName=" + ownerName + ", startLoc=" + startLoc + ", endLoc="
				+ endLoc + "]";
	}
	
	
}

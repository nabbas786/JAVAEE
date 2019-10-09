package com.nad.ds;

public class ParkingSpace {

	private int floor;
	private int slot;
	
	
	public ParkingSpace(int floor, int slot) {
		super();
		this.floor = floor;
		this.slot = slot;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + floor;
		result = prime * result + slot;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ParkingSpace) {
			ParkingSpace ps=(ParkingSpace)obj;
			return this.floor==ps.getFloor() && this.slot==ps.getSlot();
		}
		else return false;
	}
	
	
}

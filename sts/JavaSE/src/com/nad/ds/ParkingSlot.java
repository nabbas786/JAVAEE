package com.nad.ds;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ParkingSlot {
	private final int maxFoor=5;
	private final int maxSlot=10;
	private PriorityQueue<ParkingSpace> pq=new PriorityQueue<>(maxFoor*maxSlot, new Comparator<ParkingSpace>() {

		@Override
		public int compare(ParkingSpace o1, ParkingSpace o2) {
			if(o1.getFloor()==o2.getFloor()) {
				return o1.getSlot()-o2.getSlot();
			}
			return o1.getFloor()-o2.getFloor();
		}
	});
	
	public void addParkingSpace(int floor,int slot) {
		pq.add(new ParkingSpace(floor, slot));
	}
	
	public ParkingSpace getNextAvailableSlot() {
		if(pq.size()>0) {
			return pq.peek();
		}
		return null;
	}
	
	public ParkingSpace park(ParkingSpace ps) {
		if(ps==null) {
			throw new IllegalStateException("Parking is full");
		}
		pq.remove(ps);
		return ps;
	}
	
	public void unpark(ParkingSpace ps) {
		if(!pq.contains(ps)) {
			pq.add(ps);
		}else {
			throw new IllegalStateException("Invalid slot");
		}
	}
	public static void main(String[] args) {
		ParkingSlot pl=new ParkingSlot();
		pl.addParkingSpace(1, 1);
		pl.addParkingSpace(2, 1);
		pl.addParkingSpace(3, 1);
		pl.addParkingSpace(1, 2);
		pl.addParkingSpace(2, 2);
		pl.addParkingSpace(3, 2);
		
		ParkingSpace ps=pl.getNextAvailableSlot();
		ParkingSpace ps1=pl.getNextAvailableSlot();
		pl.park(ps);
		pl.park(ps);
		pl.park(ps1);
		System.out.println("Parking vehicle at floor "+ps.getFloor()+" slot "+ps.getSlot());
		System.out.println("Parking vehicle at floor "+ps1.getFloor()+" slot "+ps1.getSlot());
		pl.unpark(ps1);
		pl.unpark(ps);
		pl.unpark(ps1);
	}
}

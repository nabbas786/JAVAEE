package com.nad;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nad.model.Commuter;
import com.nad.model.VehicleOwner;

@RestController
public class CommuterResource {

	@Autowired
	private RouteServices routServices;
	
	//Method to get Matching rides for the route
	@GetMapping(value = "/matchingVehicles",produces = { "application/json" })
	
	public List<VehicleOwner> getMatchingRides(@RequestParam String start,@RequestParam String end) {
		return routServices.matchingRide(start, end);
	}
	

	//Method to fetch all rides
	@GetMapping(value="/getAllVehicles")
	public List<VehicleOwner> getAllVehicles(){
		return routServices.getAllVehicles();
	}
	

	//Method to send request
	@GetMapping(value = "/request",produces = { "application/json" })
	public Commuter sendRequest(@RequestParam int id) {
		LocalDateTime localDateTime = LocalDateTime.now();
		VehicleOwner vo=routServices.fetchRideDetails(id);
		Commuter comute=new Commuter();
		comute.setComuterName("Guest");
		comute.setStartLoc(vo.getStartLoc());
		comute.setEndLoc(vo.getEndLoc());
		comute.setTripTime(localDateTime.toString());
		return comute;
	}
	
}

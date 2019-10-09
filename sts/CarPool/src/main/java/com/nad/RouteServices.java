package com.nad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nad.entity.VehicleOwnerEntity;
import com.nad.model.Commuter;
import com.nad.model.VehicleOwner;
import com.nad.repo.VehicleOwnerRepo;

@Service
public class RouteServices {

	@Autowired
	private VehicleOwnerRepo vehicleOwnerRepo;
	
	//To fetch all the rides from DB
	public List<VehicleOwner> getAllVehicles() {
		Iterable<VehicleOwnerEntity> vEntity=vehicleOwnerRepo.findAll();
		List<VehicleOwner> allVehicles=new ArrayList<VehicleOwner>();
		vEntity.forEach(v->{
			VehicleOwner vc=new VehicleOwner();
			vc.setVid(String.valueOf(v.getVid()));
			vc.setOwnerName(v.getOwnerName());
			vc.setStartLoc(v.getStartLoc());
			vc.setEndLoc(v.getEndLoc());
			allVehicles.add(vc);
		});
		return allVehicles;
	}
	
	//For given start and end location it will fetch all the rides
	public List<VehicleOwner> matchingRide(String start,String end) {
		Iterable<VehicleOwnerEntity> vEntity=vehicleOwnerRepo.findAll();
		List<VehicleOwner> matchingVehicles=new ArrayList<VehicleOwner>();
		for(VehicleOwnerEntity v : vEntity) {
			VehicleOwner vc=new VehicleOwner();
			if(v.getStartLoc().equalsIgnoreCase(start) && v.getEndLoc().equalsIgnoreCase(end)) {
				vc.setVid(String.valueOf(v.getVid()));
				vc.setOwnerName(v.getOwnerName());
				vc.setStartLoc(v.getStartLoc());
				vc.setEndLoc(v.getEndLoc());
				matchingVehicles.add(vc);
			}
		}
		return matchingVehicles;
	}
	//This method is to fetch ride details for given ID
	public VehicleOwner fetchRideDetails(int id) {
		VehicleOwnerEntity vc= vehicleOwnerRepo.findById(id).get();
		return new VehicleOwner(String.valueOf(vc.getVid()),vc.getOwnerName(), vc.getStartLoc(), vc.getEndLoc());
		
	}
}

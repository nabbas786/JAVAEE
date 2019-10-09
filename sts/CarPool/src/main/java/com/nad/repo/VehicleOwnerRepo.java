package com.nad.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nad.entity.VehicleOwnerEntity;

public interface VehicleOwnerRepo extends JpaRepository<VehicleOwnerEntity, Integer> {

}

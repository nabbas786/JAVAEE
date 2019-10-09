package com.nad.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nad.entity.CommuterEntity;

public interface CommuterRepo extends JpaRepository<CommuterEntity, Integer>{

}

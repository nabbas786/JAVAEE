package com.nad.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nad.entity.ProductEntity;

@Repository
public interface ProductRepo extends MongoRepository<ProductEntity, String>{

	ProductEntity findBy_id(Object _id);
	ProductEntity findByProductName(Object productName);
	
}

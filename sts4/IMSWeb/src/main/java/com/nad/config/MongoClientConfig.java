package com.nad.config;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

public class MongoClientConfig extends AbstractMongoConfiguration{

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("127.0.0.1", 27017);
	}

	@Override
	protected String getDatabaseName() {

		return "IMS_DEMO";
	}

	@Override
    protected String getMappingBasePackage() {
        return "com.nad";
    }
	
}

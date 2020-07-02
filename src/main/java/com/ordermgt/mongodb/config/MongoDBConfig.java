package com.ordermgt.mongodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoDBConfig{

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoTemplate mongoTemplate =
			new MongoTemplate(mongoClient,"test");
		return mongoTemplate;

	}

	
	
}

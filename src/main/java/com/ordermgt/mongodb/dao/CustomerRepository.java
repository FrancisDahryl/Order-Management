package com.ordermgt.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ordermgt.mongodb.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}

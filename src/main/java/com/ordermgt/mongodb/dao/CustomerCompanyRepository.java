package com.ordermgt.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ordermgt.mongodb.model.CustomerCompany;

public interface CustomerCompanyRepository extends MongoRepository<CustomerCompany, String> {

}

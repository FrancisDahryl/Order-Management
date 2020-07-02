package com.ordermgt.postgres.dao;

import org.springframework.data.repository.CrudRepository;

import com.ordermgt.postgres.model.Deliveries;

public interface DeliveriesRepository extends CrudRepository<Deliveries, Long> {

}

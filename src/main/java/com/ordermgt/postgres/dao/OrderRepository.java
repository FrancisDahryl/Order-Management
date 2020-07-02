package com.ordermgt.postgres.dao;

import org.springframework.data.repository.CrudRepository;

import com.ordermgt.postgres.model.OrderPurchase;

public interface OrderRepository extends CrudRepository<OrderPurchase, Long> {

}

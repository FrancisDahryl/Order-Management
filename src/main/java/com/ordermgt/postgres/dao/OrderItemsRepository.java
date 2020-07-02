package com.ordermgt.postgres.dao;

import org.springframework.data.repository.CrudRepository;

import com.ordermgt.postgres.model.OrderItems;

public interface OrderItemsRepository extends CrudRepository<OrderItems, Long> {

}

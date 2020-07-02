package com.ordermgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ordermgt.dto.OrderManagementDTO;
import com.ordermgt.mongodb.model.Customer;
import com.ordermgt.postgres.model.Deliveries;
import com.ordermgt.postgres.model.OrderItems;
import com.ordermgt.postgres.model.OrderPurchase;
import com.ordermgt.service.OrderManagementService;

@RestController
@RequestMapping("/ordermgt")
public class OrderManagementController {
	
	@Autowired
	OrderManagementService orderManagementService;
	
	@GetMapping("/orders")
	public List<OrderManagementDTO> getOrders(){
		return orderManagementService.getOrders();
	}
	
	@PostMapping("/orders")
	public void addOrder(@RequestBody OrderPurchase orderPurchase) {
		orderManagementService.addOrder(orderPurchase);
	}
	
	@PostMapping("/order-item")
	public void addOrderItem(@RequestBody OrderItems orderItem) {
		orderManagementService.addOrderItem(orderItem);
	}
	
	@PostMapping("/customer")
	public void addCustomer(@RequestBody Customer customer) {
		orderManagementService.addCustomer(customer);
	}
	
	@PostMapping("/deliveries")
	public void addDeliveries(@RequestBody Deliveries deliveries) {
		orderManagementService.addDeliveries(deliveries);
	}
}

package com.ordermgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdermgtApplication {
//	implements CommandLineRunner
	
//	@Autowired
//	CustomerRepository customerRepository;
//	
//	@Autowired
//	OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OrdermgtApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//			
//		OrderPurchase o1 = new OrderPurchase();
//		o1.setOrder_name("second order");
//		o1.setCustomer_id("wean");
//		o1.setCreated_at("2020-01-02T15:34:12Z");
//		System.out.println("Order1: " +  o1);
//		
//		orderRepository.save(o1);
//	}

}

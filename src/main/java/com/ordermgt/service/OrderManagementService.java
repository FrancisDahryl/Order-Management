package com.ordermgt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermgt.dto.OrderManagementDTO;
import com.ordermgt.mongodb.dao.CustomerCompanyRepository;
import com.ordermgt.mongodb.dao.CustomerRepository;
import com.ordermgt.mongodb.model.Customer;
import com.ordermgt.mongodb.model.CustomerCompany;
import com.ordermgt.mongodb.model.CustomerCompanyInfo;
import com.ordermgt.postgres.dao.DeliveriesRepository;
import com.ordermgt.postgres.dao.OrderItemsRepository;
import com.ordermgt.postgres.dao.OrderRepository;
import com.ordermgt.postgres.model.Deliveries;
import com.ordermgt.postgres.model.OrderInfo;
import com.ordermgt.postgres.model.OrderItems;
import com.ordermgt.postgres.model.OrderPurchase;

@Service
public class OrderManagementService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerCompanyRepository customerCompanyRepository;
	
	@Autowired
	OrderItemsRepository orderItemsRepository;
	
	@Autowired
	DeliveriesRepository deliveriesRepository;

	
	
	@SuppressWarnings("unlikely-arg-type")
	public List<OrderManagementDTO> getOrders() {
		List<OrderInfo> orderInfoResults = getOrderInfo();
		
		List<CustomerCompanyInfo> customerResults = getCustomerCompanyInfo();
		
		List<OrderManagementDTO> orderMgtDTO = new ArrayList<>();
		
		for(OrderInfo op: orderInfoResults) {
			for(CustomerCompanyInfo customer: customerResults) {
				
				if(op.getId().equals(customer.getCustomer_id())) {
					OrderManagementDTO omgt = new OrderManagementDTO();
					omgt.setOrder_name(op.getOrderName());
					omgt.setCustomer_name(customer.getCustomer_name());
					omgt.setOrder_date(op.getOrderDate());
					
					orderMgtDTO.add(omgt);
				}
			}
		}
		
		
		
		return orderMgtDTO;
	}
	
	private List<CustomerCompanyInfo> getCustomerCompanyInfo(){
		List<CustomerCompanyInfo> customerCompanyList = new ArrayList<>();
		
		Iterable<Customer> customerResults = customerRepository.findAll();
		Iterable<CustomerCompany> customerCompanyResults = customerCompanyRepository.findAll();
		
		for( Customer c: customerResults) {
			for( CustomerCompany cc: customerCompanyResults) {
				
				if(c.getCompanyId().equals(cc.getId())) {
					CustomerCompanyInfo cci = new CustomerCompanyInfo();
					cci.setCompany_name(cc.getCompany_name());
					cci.setCustomer_name(c.getName());
					cci.setCustomer_id(c.getId());
					
					customerCompanyList.add(cci);
				}
				
			}
		}
		
		return customerCompanyList;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	private List<OrderInfo> getOrderInfo(){
		List<OrderInfo> orderInfoList = new ArrayList<>();
		
		Iterable<Deliveries> deliveriesResults = deliveriesRepository.findAll();
		
		Iterable<OrderItems> orderItemsResults = orderItemsRepository.findAll();
		
		Iterable<OrderPurchase> orderPurchaseResults = orderRepository.findAll();
		
		for(OrderPurchase o: orderPurchaseResults) {
			for( Deliveries d: deliveriesResults) {
				for( OrderItems oi: orderItemsResults) {
					if(d.getOrder_item_id().equals(oi.getId())) {
						if(oi.getOrder_id().equals(o.getId())) {
							OrderInfo orderInfo = new OrderInfo();
							orderInfo.setId(o.getId());
							orderInfo.setOrderDate(o.getCreated_at());
							orderInfo.setOrderName(o.getOrder_name());
							
							orderInfo.setDeliveredAmount(
									orderInfo.computeAmount(oi.getPrice_per_unit(), d.getDelivered_quantity()));
							
							orderInfo.setTotalAmount(orderInfo.getDeliveredAmount());
							
							
							orderInfoList.add(orderInfo);
						}
					}
					
				}
			}
			
		}
		
		
		return orderInfoList;
	}
	
	public void addOrder(OrderPurchase orderPurchase) {
		orderRepository.save(orderPurchase);
	}
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void addOrderItem(OrderItems orderItems) {
		orderItemsRepository.save(orderItems);
	}
	public void addDeliveries(Deliveries deliveries) {
		deliveriesRepository.save(deliveries);
	}
	
}

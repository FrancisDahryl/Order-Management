package com.ordermgt.postgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deliveries")
public class Deliveries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "order_item_id")
	private String order_item_id;
	
	@Column(name = "delivered_quantity")
	private long delivered_quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(String order_item_id) {
		this.order_item_id = order_item_id;
	}

	public long getDelivered_quantity() {
		return delivered_quantity;
	}

	public void setDelivered_quantity(long delivered_quantity) {
		this.delivered_quantity = delivered_quantity;
	}

	@Override
	public String toString() {
		return "Deliveries [id=" + id + ", order_item_id=" + order_item_id + ", delivered_quantity="
				+ delivered_quantity + "]";
	}
	
}

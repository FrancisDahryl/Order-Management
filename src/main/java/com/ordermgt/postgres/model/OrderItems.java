package com.ordermgt.postgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "order_id")
	private String order_id;
	
	@Column(name = "price_per_unit")
	private Long price_per_unit;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "product")
	private String product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Long getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(Long price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", order_id=" + order_id + ", price_per_unit=" + price_per_unit + ", quantity="
				+ quantity + ", product=" + product + "]";
	}
	
	
}

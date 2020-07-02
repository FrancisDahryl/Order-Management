package com.ordermgt.dto;

public class OrderManagementDTO {
	
	private String order_name;
	
	private String customer_company;
	
	private String customer_name;
	
	private String order_date;
	
	private String deliver_amount;
	
	private String total_amount;
	

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getCustomer_company() {
		return customer_company;
	}

	public void setCustomer_company(String customer_company) {
		this.customer_company = customer_company;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getDeliver_amount() {
		return deliver_amount;
	}

	public void setDeliver_amount(String deliver_amount) {
		this.deliver_amount = deliver_amount;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}



	@Override
	public String toString() {
		return "OrderManagementDTO [order_name=" + order_name + ", customer_company=" + customer_company
				+ ", customer_name=" + customer_name + ", order_date=" + order_date + ", deliver_amount="
				+ deliver_amount + ", total_amount=" + total_amount + "]";
	}

	
}

package com.ordermgt.postgres.model;

public class OrderInfo {

		private long id;
	
		private String orderDate;
		
		private String orderName;
		
		private long deliveredAmount;
		
		private long totalAmount;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public long getDeliveredAmount() {
			return deliveredAmount;
		}

		public void setDeliveredAmount(long deliveredAmount) {
			this.deliveredAmount = deliveredAmount;
		}

		public long getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(long totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getOrderName() {
			return orderName;
		}

		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}
		
		
		public long computeAmount(long pricePerUnit, long deliveredQuantity) {
			return pricePerUnit * deliveredQuantity;
		}
		
	
}

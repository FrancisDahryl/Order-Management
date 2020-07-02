package com.ordermgt.mongodb.model;

import javax.persistence.Id;

public class CustomerCompany {
	
	@Id
	private String id;
	
	private String company_name;

	public String getId() {
		return id;
	}

	public void setId(String company_id) {
		this.id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	@Override
	public String toString() {
		return "CustomerCompany [company_id=" + id + ", company_name=" + company_name + "]";
	}
	
	
	
}

package com.ordermgt.mongodb.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
	private String id;

	private String login;
	
	private String password;

	private String name;
	
	private String company_id;

	private ArrayList<String> credit_cards;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public ArrayList<String> getCredit_cards() {
		return credit_cards;
	}

	public void setCredit_cards(ArrayList<String> credit_cards) {
		this.credit_cards = credit_cards;
	}

	public String getCompanyId() {
		return company_id;
	}

	public void setCompanyId(String customerId) {
		this.company_id = customerId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + ", customerId="
				+ company_id + ", credit_cards=" + credit_cards + "]";
	}


}

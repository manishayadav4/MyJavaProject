package com.example.entities;

import org.hibernate.annotations.Entity;

@Entity
public class Customer {
	@Id
	private int customerId;
	private String address;
	private String contact;
	private String email;

	@ManyToOne
	Order order;

	public Customer(int customerId, String address, String contact, String email, Order order) {
		super();
		this.customerId = customerId;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.order = order;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}

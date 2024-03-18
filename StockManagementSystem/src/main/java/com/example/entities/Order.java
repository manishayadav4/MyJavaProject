package com.example.entities;

import java.time.LocalDate;

import javax.persistence.ManyToOne;

import org.hibernate.annotations.Entity;

@Entity
public class Order {
	@Id
	private int orderId;
	private LocalDate orderDate;
	private String paymentMethod;
	private double amount;
	private String status;
	@ManyToOne
	Product product;

	public Order(int orderId, LocalDate orderDate, String paymentMethod, double amount, String status,
			Product product) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.status = status;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}

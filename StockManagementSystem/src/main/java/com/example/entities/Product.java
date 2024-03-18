package com.example.entities;

import java.time.LocalDate;
import java.util.function.Supplier;
import javax.persistence.Manytoone;
import org.hibernate.annotations.Entity;

@Entity
public class Product {
	@Id
	private int productId;
	private double price;
	private String type;
	private LocalDate expiryDate;
	private String productName;

	@ManyToOne
	Supplier supplier;

	public Product(int productId, double price, String type, LocalDate expiryDate, String productName,
			Supplier supplier) {
		super();
		this.productId = productId;
		this.price = price;
		this.type = type;
		this.expiryDate = expiryDate;
		this.productName = productName;
		this.supplier = supplier;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}

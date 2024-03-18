package com.example.entities;

import javax.persistence.Manytoone;
import org.hibernate.annotations.Entity;

@Entity
public class Supplier {
	@Id
	private String supplierName;
	private int supplierID;
	private String contact;
	private String email;
	@ManyToOne
	Product product;

	public Supplier(String supplierName, int supplierID, String contact, String email, Product product) {
		super();
		this.supplierName = supplierName;
		this.supplierID = supplierID;
		this.contact = contact;
		this.email = email;
		this.product = product;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
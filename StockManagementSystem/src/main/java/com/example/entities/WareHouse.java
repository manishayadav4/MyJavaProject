package com.example.entities;
import javax.persistence.Manytoone;

import org.hibernate.annotations.Entity;
@Entity
public class WareHouse {
	@Id
	private int warehouseId;
	 private String manager;
	    private String location;
	    private int capacity;
	    private String temperature;
	    
@ManyToOne
Product product;

public WareHouse(int warehouseId, String manager, String location, int capacity, String temperature, Product product) {
	super();
	this.warehouseId = warehouseId;
	this.manager = manager;
	this.location = location;
	this.capacity = capacity;
	this.temperature = temperature;
	this.product = product;
}

public int getWarehouseId() {
	return warehouseId;
}

public void setWarehouseId(int warehouseId) {
	this.warehouseId = warehouseId;
}

public String getManager() {
	return manager;
}

public void setManager(String manager) {
	this.manager = manager;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String getTemperature() {
	return temperature;
}

public void setTemperature(String temperature) {
	this.temperature = temperature;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}


}



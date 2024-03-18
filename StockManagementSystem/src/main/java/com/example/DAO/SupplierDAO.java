package com.example.DAO;

import java.util.List;

import org.hibernate.criterion.Order;

import com.example.entities.Supplier;

public interface SupplierDAO {
	public boolean saveSupplier(Supplier supplier);

	List<Supplier> getSupplier(Supplier supplier);

	public Supplier getSupplierById(int supplierid);

	public boolean updateSupplier(int supplierId);

	public boolean deleteSupplier(int supplierId);

}

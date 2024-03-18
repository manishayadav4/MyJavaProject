package com.example.DAO;

import java.util.List;

import com.example.entities.Customer;
import com.example.entities.Product;

public interface CustomerDAO {
	public boolean saveCustomer(Customer customer);

	List<Customer> getCustomer(Customer customer);

	public Customer getCustomerById(int customerid);

	public boolean updateCustomer(int customerId);

	public boolean deleteCustomer(int customerId);

}

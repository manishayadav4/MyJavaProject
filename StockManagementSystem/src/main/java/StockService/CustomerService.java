package StockService;

import java.util.List;

import com.example.entities.Customer;

public interface CustomerService {
	public boolean saveCustomer(Customer customer);

	List<Customer> getCustomer(Customer customer);

	public Customer getCustomerById(int customerid);

	public boolean updateCustomer(int customerId);

	public boolean deleteCustomer(int customerId);

}

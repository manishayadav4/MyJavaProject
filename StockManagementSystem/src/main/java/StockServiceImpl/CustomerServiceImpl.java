package StockServiceImpl;

import java.util.List;

import com.example.DAO.CustomerDAO;
import com.example.DAOImpl.CustomerDAOImpl;
import com.example.entities.Customer;

import StockService.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO customerdao = new CustomerDAOImpl();

	public boolean saveCustomer(Customer customer) {
		return customerdao.saveCustomer(customer);
	}

	public List<Customer> getCustomer(Customer customer) {
		return customerdao.getCustomer(customer);
	}

	public Customer getCustomerById(int customerid) {
		return customerdao.getCustomerById(customerid);
	}

	public boolean updateCustomer(int CustomerId) {
		return customerdao.updateCustomer(CustomerId);
	}

	public boolean deleteCustomer(int customerId) {
		return customerdao.deleteCustomer(customerId);
	}
}

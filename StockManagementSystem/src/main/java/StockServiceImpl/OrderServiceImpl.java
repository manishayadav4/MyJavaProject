package StockServiceImpl;

import java.util.List;

import org.hibernate.criterion.Order;

import com.example.DAO.OrderDAO;
import com.example.DAOImpl.OrderDAOImpl;

import StockService.OrderService;

public class OrderServiceImpl implements OrderService {
	OrderDAO orderdao = new OrderDAOImpl();

	public boolean saveOrder(Order order) {
		return orderdao.saveOrder(order);
	}

	public List<Order> getOrder(Order order) {
		return orderdao.getOrder(order);
	}

	public Order getOrderById(int orderid) {
		return orderdao.getOrderById(orderid);
	}

	public boolean updateOrder(int orderId) {
		return orderdao.updateOrder(orderId);
	}

	public boolean deleteOrder(int orderId) {
		return orderdao.deleteOrder(orderId);
	}
}

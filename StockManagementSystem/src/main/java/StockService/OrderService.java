package StockService;

import java.util.List;

import org.hibernate.criterion.Order;

public interface OrderService {
	public boolean saveOrder(Order order);

	List<Order> getOrder(Order order);

	public Order getOrderById(int orderid);

	public boolean updateOrder(int orderId);

	public boolean deleteOrder(int orderId);

}

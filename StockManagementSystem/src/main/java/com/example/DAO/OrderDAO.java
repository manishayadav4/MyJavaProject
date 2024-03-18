package com.example.DAO;

import java.util.List;

import org.hibernate.criterion.Order;

public interface OrderDAO {

	public boolean saveOrder(Order order);

	List<Order> getOrder(Order order);

	public Order getOrderById(int orderid);

	public boolean updateOrder(int orderId);

	public boolean deleteOrder(int orderId);

}

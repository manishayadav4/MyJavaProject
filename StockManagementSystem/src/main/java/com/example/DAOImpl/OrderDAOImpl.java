package com.example.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.entities.Order;

public class OrderDAOImpl {
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrder(Order order) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(order);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
		return false;
	}

	@Override
	public List<Order> getOrder(Order order) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Order> query = session.createQuery("FROM Order WHERE name = :name", Order.class);
			query.setParameter("name", Order.getName());
			return query.getResultList();
		}
	}

	@Override
	public Order getOrderById(int Orderid) {
		try (Session session = HibernateUtil.getSession()) {
			Order order = session.get(Order.class, OrderId);

			if (Order != null) {
				System.out.println("Order found with ID: " + OrderId);
				System.out.println("Order Name: " + Order.getName());

			} else {
				System.out.println("Order not found with ID: " + OrderId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateOrder(int OrderId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Order order = session.get(Order.class, OrderId);
			session.update(order);
			tx.commit();
			return true;
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception is :" + e);
		} catch (Exception e) {
			System.out.println("Exception is :" + e);
		}
		return false;
	}

	@Override
	public boolean deleteOrder(int OrderId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Order order = session.get(Orderclass, OrderId);
			if (Order != null) {
				session.delete(Order);
				tx.commit();
				return true;
			} else {
				System.out.println("Order not found with ID: " + OrderId);
			}
		}
		return false;
	}

}

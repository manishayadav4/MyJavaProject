package com.example.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.DAO.CustomerDAO;
import com.example.entities.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveCustomer(Customer customer) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(customer);
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
	public List<Customer> getCustomer(Customer customer) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Customer> query = session.createQuery("FROM Customer WHERE name = :name", Customer.class);
			query.setParameter("name", Customer.getName());
			return query.getResultList();
		}
	}

	@Override
	public Customer getCustomerById(int customerid) {
		try (Session session = HibernateUtil.getSession()) {
			Customer customer = session.get(Customer.class, customerId);

			if (Customer != null) {
				System.out.println("Customer found with ID: " + CustomerId);
				System.out.println("Customer Name: " + Customer.getName());

			} else {
				System.out.println("Customer not found with ID: " + CustomerId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateCustomer(int CustomerId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Customer customer = session.get(Customer.class, CustomerId);
			session.update(wareHouse);
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
	public boolean deleteCustomer(int CustomerId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Customer customer = session.get(Customerclass, customerId);
			if (customer != null) {
				session.delete(customer);
				tx.commit();
				return true;
			} else {
				System.out.println("Customer not found with ID: " + CustomerId);
			}
		}
		return false;
	}

}

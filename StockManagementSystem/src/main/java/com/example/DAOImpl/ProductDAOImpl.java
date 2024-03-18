package com.example.DAOImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.DAO.ProductDAO;
import com.example.entities.Product;

public class ProductDAOImpl implements  ProductDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(Product product) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(product);
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
	public List<Product> getProduct(Product product) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Product> query = session.createQuery("FROM Product WHERE name = :name",product.class);
			query.setParameter("name",Product.getName());
			return query.getResultList();
		}
	}

	@Override
	public Product getProductById(int Productid) {
		try (Session session = HibernateUtil.getSession()) {
			Product Product  = session.get(Product.class, ProductId);

			if (Product != null) {
				System.out.println("Product found with ID: " + ProductId);
				System.out.println("Product Name: " + Product.getName());

			} else {
				System.out.println("Product not found with ID: " + ProductId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateProduct(int ProductId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Product Product = session.get(Product.class,ProductId);
			session.update(Product);
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
	public boolean deleteProduct(int productId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Product product = session.get(Productclass, productId);
			if (Product != null) {
				session.delete(Product);
				tx.commit();
				return true;
			} else {
				System.out.println("Product not found with ID: " + productId);
			}
		}
		return false;
	}

}

}

package com.example.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.DAO.SupplierDAO;
import com.example.entities.Supplier;

public class SupplierDAOImpl implements SupplierDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveSupplier(Supplier supplier ) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(supplier);
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
	public List<Supplier> getOrder(Supplier supplier) {
		try (Session session = HibernateUtil.getSession()) {
			Query<Supplier> query = session.createQuery("FROM Supplier WHERE name = :name", Supplier.class);
			query.setParameter("name", Order.getName());
			return query.getResultList();
		}
	}

	@Override
	public Supplier getSupplierById(int Supplierid) {
		try (Session session = HibernateUtil.getSession()) {
			Supplier Supplier = session.get(Supplierr.class,SupplierId);

			if (Supplier != null) {
				System.out.println("Supplier found with ID: " + SupplierId);
				System.out.println("Supplier Name: " + Supplier.getName());

			} else {
				System.out.println("Supplier not found with ID: " + SupplierId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateSupplier(int SupplierId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Supplier Supplier = session.get(Supplier.class, SupplierId);
			session.update(Supplier);
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
	public boolean deleteSupplier(int supplierId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Supplier Supplierr = session.get(Supplierclass,supplierId);
			if (Supplier!= null) {
				session.delete(supplier);
				tx.commit();
				return true;
			} else {
				System.out.println("Supplier not found with ID: " + supplierId);
			}
		}
		return false;
	}

}



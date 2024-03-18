package com.example.DAOImpl;

import com.example.DAO.WareHouseDAO;
import com.example.entities.WareHouse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class WareHouseDAOImpl implements WareHouseDAO {
	SessionFactory sessionFactory;

	@Override
	public boolean saveWareHouse(WareHouse wareHouse) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			session.save(wareHouse);
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
	public List<WareHouse> getWareHouse(WareHouse wareHouse) {
		try (Session session = HibernateUtil.getSession()) {
			Query<WareHouser> query = session.createQuery("FROM wareHouse WHERE name = :name", Author.class);
			query.setParameter("name", wareHouse.getName());
			return query.getResultList();
		}
	}

	@Override
	public WareHouse getWareHouseById(int wareHouserid) {
		try (Session session = HibernateUtil.getSession()) {
			WareHouse wareHouse = session.get(WareHouse.class, wareHouseId);

			if (wareHouse != null) {
				System.out.println("wareHouse found with ID: " + wareHouseId);
				System.out.println("wareHouse Name: " + wareHouse.getName());

			} else {
				System.out.println("wareHouse not found with ID: " + wareHouseId);
			}
		}
		;
		return null;
	}

	@Override
	public boolean updateWareHouse(int WareHouseId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			WareHouse wareHouse = session.get(wareHouse.class, wareHouseId);
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
	public boolean deleteWareHouse(int WareHouseId) {
		try (Session session = HibernateUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			WareHouse wareHouse = session.get(WareHouseclass, wareHouseId);
			if (wareHouse != null) {
				session.delete(wareHouse);
				tx.commit();
				return true;
			} else {
				System.out.println("wareHouse not found with ID: " + wareHouseId);
			}
		}
		return false;
	}

}

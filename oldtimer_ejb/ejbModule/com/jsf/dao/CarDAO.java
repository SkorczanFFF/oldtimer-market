package com.jsf.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jsf.entities.Car;

//DAO - Data Access Object for Person entity
//Designed to serve as an interface between higher layers of application and data.
//Implemented as stateless Enterprise Java bean - server side code that can be invoked even remotely.

@Stateless
public class CarDAO {
	private final static String UNIT_NAME = "oldtimer";

	// Dependency injection (no setter method is needed)
	@PersistenceContext(unitName = UNIT_NAME)
	protected EntityManager em;

	public void create(Car car) {
		em.persist(car);
		//em.flush();
	}
	
	public Car merge(Car car) {
		return em.merge(car);
	}

	public void remove(Car car) {
		em.remove(em.merge(car));
	}
	public Car find(Object id) {
		return em.find(Car.class, id);
	}
	
	public List<Car> getFullList() {
		List<Car> list = null;

		Query query = em.createQuery("select c from Car c");

		try {
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Car> getList(Map<String, Object> searchParams) {
		List<Car> list = null;

		String select = "select c ";
		String from = "from Car c ";
		String where = "";
		String orderby = " order by c.date desc";

		String brand = (String) searchParams.get("brand");
		if (brand != null) {
			if (where.isEmpty()) {
				where = "where ";
			} else {
				where += "and ";
			}
			where += "c.brand like :brand OR c.model like :brand OR c.title like :brand";
		}

		Query query = em.createQuery(select + from + where + orderby);

		if (brand != null) {
			query.setParameter("brand", "%"+brand+"%");
		}


		try {
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public List<Car> getNewest() {
		List<Car> newest = null;

		String select = "select c ";
		String from = "from Car c ";
		String where = "";
		String orderby = " order by c.date desc";

		Query query = em.createQuery(select + from + where + orderby);

		try {
			newest = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return newest;
	}

}
package com.jsf.dao;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.jsf.entities.Car;
import com.jsf.entities.User;

@Stateless
public class UserDAO {
	private final static String UNIT_NAME = "oldtimer";
	
	@PersistenceContext(unitName = UNIT_NAME)
	protected EntityManager em;
	
	public void create(User user) {
		em.persist(user);
	}
	
	public User merge(User user) {
		return em.merge(user);
	}
	
	public void remove(User user) {
		em.remove(em.merge(user));
	}
	
	public User find(Object nick) {
		return em.find(User.class, nick);
	}
	
	public User login(String nick, String pass) {
		User user = null;
		
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.nick = :nick AND u.pass = :pass", User.class);
		query.setParameter("nick", nick);
		query.setParameter("pass", pass);
		
		try {
			user = query.getSingleResult();
		} catch (NoResultException exception) {
			return null;
		}
		
		return user;
	}
	
	public List<User> getUsers() {
		return em.createQuery("SELECT u FROM User u", User.class).getResultList();    
	}
	
	public List<User> getList() {
		List<User> list = null;

		// 1. Build query string with parameters
		String select = "select u ";
		String from = "from User u ";
		String where = "";
		String orderby = "";

		// ... other parameters ... 

		// 2. Create query object
		Query query = em.createQuery(select + from + where + orderby);



		try {
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
}
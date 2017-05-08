package com.huios.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.huios.metier.Client;

public class Dao implements IDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-pu");

	@Override
	public long addClient(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		return c.getId();
	}

}

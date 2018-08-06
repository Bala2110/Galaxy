package com.galaxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.galaxy.dao.SearchDao;
import com.galaxy.model.Registration;

@Repository
public class SearchDaoImpl implements SearchDao {

	private static final Logger logger = LoggerFactory.getLogger(SearchDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<Registration> listCandidates(String input) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(input);
		String hql ="from Registration where name like :input";
		Query query =session.createQuery(hql);
		query.setParameter("input","%"+ input+"%");
		List<Registration> candidatesList = query.list();
		for (Registration c : candidatesList) {
			System.out.println(c);
			logger.info("candidates List::" + c);
		}
		return candidatesList;
	}
}

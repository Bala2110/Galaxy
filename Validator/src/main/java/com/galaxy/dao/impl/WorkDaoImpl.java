package com.galaxy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.galaxy.dao.WorkDao;
import com.galaxy.model.Registration;


@Repository
public class WorkDaoImpl implements WorkDao{

	private static final Logger logger = LoggerFactory.getLogger(SearchDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from Registration")
				//+ "where staus=registered")
				.list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}
	
	/*@Override
	public list<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from addcandidate where staus=inprogress").list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}
	
	@Override
	public list<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from addcandidate where staus=highpriority").list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}
	
	@Override
	public list<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from addcandidate where staus=lowpriority").list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}
	
	@Override
	public list<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from addcandidate where staus=completed").list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}
	
	@Override
	public list<Registration> listCandidates(String status){
		Session session=this.sessionFactory.getCurrentSession();
		List<Registration> listCandidates= session.createQuery("from addcandidate where staus=rejected").list();
		for(Registration c : listCandidates){
			logger.info("Candidate List::"+c);
		}
		return listCandidates;		
	}*/
}

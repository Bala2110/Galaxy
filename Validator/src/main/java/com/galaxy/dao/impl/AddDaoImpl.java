package com.galaxy.dao.impl;

import java.sql.SQLException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.galaxy.dao.AddDao;
import com.galaxy.model.Registration;


@Repository
public class AddDaoImpl implements AddDao
{

	private static final Logger logger = LoggerFactory.getLogger(AddDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
		//@Override
	public boolean candidateDetails( Registration reg) throws SQLException
		{
			Session session=this.sessionFactory.getCurrentSession();
			session.persist(reg);
			logger.info("Candidate added successfully");

			
				return true;
			
			
		}

}
package com.galaxy.dao.impl;


import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.galaxy.dao.UserDao;


@Repository
public class UserDaoImpl implements UserDao
{

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
		//@Override
		public boolean isValidUser(String username, String password) throws SQLException
		{
			Session session=this.sessionFactory.getCurrentSession();
			List user=session.createQuery("from User where userName =:userName and password =:password").setParameter("userName", username).setParameter("password", password).list();
			if(user.size()>0) {
				return true;
			}else {
				return false;
			}
				
			
		}

}
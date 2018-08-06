package com.galaxy.service.impl;

import java.sql.SQLException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.dao.AddDao;

import com.galaxy.model.Registration;
import com.galaxy.service.AddService;

@Service
public class AddServiceImpl implements AddService {
	
	@Autowired
	AddDao addDao;
	public AddDao getAddDao() {
		return addDao;
	}

	public void setAddDao(AddDao addDao) {
		this.addDao = addDao;
	}

	@Transactional
	public boolean candidateDetails( Registration reg) throws SQLException{
		return addDao.candidateDetails(reg);
	}
}

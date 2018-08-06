package com.galaxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galaxy.dao.SearchDao;
import com.galaxy.dao.WorkDao;
import com.galaxy.model.Registration;
import com.galaxy.service.WorkService;

@Service
public class WorkServiceImpl implements WorkService{
	@Autowired
	WorkDao workDao;
	
	public WorkDao getWorkDao() {
		return workDao;
	}



	public void setWorkDao(WorkDao workDao) {
		this.workDao = workDao;
	}



	@Override
	@Transactional
	public List<Registration> listCandidates(String status) {
		return workDao.listCandidates(status);
	}

	
}

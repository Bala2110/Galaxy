package com.galaxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galaxy.dao.SearchDao;
import com.galaxy.model.Registration;
import com.galaxy.service.SearchService;


@Service
public class SearchServiceImpl implements SearchService{
	@Autowired
	 SearchDao searchDao;

	
	
	public SearchDao getSearchDao() {
		return searchDao;
	}



	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
	}



	@Override
	@Transactional
	public List<Registration> listCandidates(String name) {
		return searchDao.listCandidates(name);
	}

	
}
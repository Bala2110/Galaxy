package com.galaxy.dao;

import java.util.List;

import com.galaxy.model.Registration;

public interface SearchDao {
	
	public List<Registration> listCandidates(String name);
	
}

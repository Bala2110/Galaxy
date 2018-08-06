package com.galaxy.dao;

import java.util.List;

import com.galaxy.model.Registration;

public interface WorkDao {
	
	public List<Registration> listCandidates(String status);

}

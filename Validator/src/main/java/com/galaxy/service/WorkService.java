package com.galaxy.service;

import java.util.List;

import com.galaxy.model.Registration;

public interface WorkService {
	
	public List<Registration> listCandidates(String status);

}

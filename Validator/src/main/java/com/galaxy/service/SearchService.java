package com.galaxy.service;

import java.util.List;

import com.galaxy.model.Registration;


public interface SearchService{
	
	public List<Registration> listCandidates(String name);
}
package com.galaxy.service;

import java.sql.SQLException;

import com.galaxy.model.Registration;

public interface AddService {
	
	public boolean candidateDetails( Registration reg) throws SQLException;


}

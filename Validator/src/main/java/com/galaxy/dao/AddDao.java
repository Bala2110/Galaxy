package com.galaxy.dao;

import java.sql.SQLException;

import com.galaxy.model.Registration;

public interface AddDao {
	
	public boolean candidateDetails( Registration reg) throws SQLException;


}

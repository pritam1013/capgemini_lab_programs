package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.model.Trainee;

public interface TraineeJdbc {
	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public Trainee findTrainee(int id) throws SQLException;
	public boolean removeTrainee(int id) throws SQLException;
		
	}



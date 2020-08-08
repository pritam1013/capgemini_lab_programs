package com.capg.service;

import java.sql.SQLException;

import com.capg.dao.TraineeDaoJdbcImpl;
import com.capg.dao.TraineeJdbc;
import com.capg.model.Trainee;

public class TraineeServiceJdbc implements ITraineeServiceJdbc {

	TraineeJdbc dao;
	public TraineeServiceJdbc() throws SQLException {
		dao=new TraineeDaoJdbcImpl();
	}
	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		// TODO Auto-generated method stub
	
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee findTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findTrainee(id);
	}

	@Override
	public boolean removeTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.removeTrainee(id);
	}

}

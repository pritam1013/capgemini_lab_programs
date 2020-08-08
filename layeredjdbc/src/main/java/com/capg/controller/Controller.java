package com.capg.controller;

import java.sql.SQLException;

import com.capg.model.Trainee;
import com.capg.service.ITraineeServiceJdbc;
import com.capg.service.TraineeServiceJdbc;

public class Controller {
ITraineeServiceJdbc service;
	
	public Controller() throws SQLException {
	service=new TraineeServiceJdbc();
	}
	
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return service.addTrainee(trainee);
	}
	public Trainee findTrainee(int id) throws SQLException {
		return service.findTrainee(id);
	}
	public boolean removeTrainee(int id) throws SQLException {
		return service.removeTrainee(id);
	}
}

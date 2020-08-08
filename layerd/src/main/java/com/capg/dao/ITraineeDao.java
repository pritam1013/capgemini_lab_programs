package com.capg.dao;

import com.capg.model.Trainee;

public interface ITraineeDao {
public Trainee addTrainee(Trainee trainee);
public Trainee findTrainee(int id);
public boolean removeTrainee(int id);
}

package com.capg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capg.model.Trainee;

public class TraineeDaoImpl implements ITraineeDao {
public static List<Trainee> traineeList=new ArrayList();
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		if(trainee!=null)
		{
		traineeList.add(trainee);
	}
		return trainee;
	}
	public Trainee findTrainee(int id) {
		// TODO Auto-generated method stub
		for (Trainee trainee : traineeList) {
			if(trainee.getId()==(id))
			{
				return trainee;
			}
		}
		return null;
		
	}

	public boolean removeTrainee(int id) {
		// TODO Auto-generated method stub
	for (Trainee trainee : traineeList) {
		if(trainee.getId()==(id))
		{
			traineeList.remove(trainee);
			return true;
		}
		
	}
	return false;
}
	}



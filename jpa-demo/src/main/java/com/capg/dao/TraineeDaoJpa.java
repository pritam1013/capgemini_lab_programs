package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.dbutil.Utility;
import com.capg.model.Trainee;

public class TraineeDaoJpa {
	 
	
	EntityManager em=Utility.emf().createEntityManager();

	public Trainee addTrainee(Trainee trainee)
	{
		
		 EntityTransaction tx=em.getTransaction();
		 tx.begin(); em.persist(trainee); tx.commit(); System.out.println("Added");
		 return trainee;
	}
	public Trainee findTrainee(int id)
	{
		
		EntityTransaction tx=em.getTransaction();
		 tx.begin();
		Trainee t1 = em.find(Trainee.class, id);
		tx.commit();
		 if(t1!=null)
		 {
			 return t1;
		 }
		 else
		 {
			 return null;
		 }
	}
	

}

package com.capg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.dao.TraineeDaoJpa;
import com.capg.model.Trainee;

public class Presentation {
	static Scanner  scan;
	static TraineeDaoJpa impl;
	public static void main(String[] args)
	{
		while(true)
		{
			
			int choice =0;
			boolean flag=false;
			do {
				scan=new Scanner(System.in);
				System.out.println("Please select from the above options");
				try {
					 choice=scan.nextInt();
					 flag=true;
				}
				catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Please Enter the number");
				}
				
			}
			while(!flag);
			switch(choice)
			{
			case 1: addTrainee();
			break;
		
			case 2: 
			findTrainee(); 
			break;
		 
			default: System.out.println("sakkaga ottayaaa");
			}
		}
		
	}
	public static void addTrainee()
	{
		int id=0;
		boolean internalFlag=false;

		do {
			System.out.println("Enter the trainee id");
			scan=new Scanner(System.in);
			try {
			id=scan.nextInt();
			internalFlag=true;
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.err.println("Enter numbers");
			}
		}
		while(!internalFlag);
		
		System.out.println("Enter the trainee name");
		String name=scan.next();
		System.out.println("Enter the email");
		String email=scan.next();
		Trainee trainee=new Trainee(id,name,email);
		impl=new TraineeDaoJpa();
		System.out.println(impl.addTrainee(trainee)+" added successfully");	
	}
	private static void findTrainee()
	{
		int id=0;
		boolean internalFlag=false;
		do {
			scan=new Scanner(System.in);
			System.out.println("Enter the trainee id");
			try {
				id=scan.nextInt();
				internalFlag=true;
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Enter digits only");
			}
			}
			while(!internalFlag);
		impl=new TraineeDaoJpa();
		if(impl.findTrainee(id)!=null)
		{
			System.out.println("Trainee found");
		}
		else {
			System.out.println("Trainee doesnot exist");
		}
}
}
package com.capg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.dao.TraineeDaoImpl;
import com.capg.model.Trainee;
import com.capg.service.ITraineeService;
import com.capg.service.TraineeServiceImpl;

public class Presentation {

	static Scanner scan ;
	static ITraineeService service =new TraineeServiceImpl();;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		boolean flag=false;
		while(true)
		{
			System.out.println("Welcome to trainee management");
			System.out.println("click on  1 for Adding a trainee");
			System.out.println("click on  2 for finding a trainee");
			System.out.println("click on  3 for removing a trainee");
			System.out.println("click on  4 to view a particular trainee");
			do {
				scan=new Scanner(System.in);
				System.out.println("Please enter from the above Options");
				
				try {
					choice=scan.nextInt();
					flag=true;
				}
				catch (InputMismatchException e) {
					// TODO: handle exception
				System.err.println("Enter the valid choice");
				}
			}
				while(!flag);
				switch(choice)
				{
				case 1: addTrainee();
						break;
				case 2: findTrainee();
					break;
				case 3: removeTrainee();
						break;
				case 4: viewTrainee();
				break;
				default:
						Presentation.main(null);
				}
				
			
			
			
			
		}

	}
	private static void addTrainee()
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
		
		System.out.println(service.addTrainee(trainee)+" added successfully");
		
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
		
		if(service.findTrainee(id)!=null)
		{
			System.out.println("Trainee found");
		}
		else {
			System.out.println("Trainee not found");
		}
		
	}
	private static void removeTrainee()
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
				System.err.println("Enter digits only");
			}
			}
			while(!internalFlag);
		
		if(service.removeTrainee(id)==false)
		{
			System.out.println("Trainee not found");
		}
		else {
			System.out.println("Trainee Deleted");
		}
}
	private static void viewTrainee()
	{
		System.out.println(TraineeDaoImpl.traineeList);
	
}

}
package com.capg.ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.controller.Controller;
import com.capg.model.Trainee;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scan;
	static Controller controller;
	
    public static void main( String[] args ) throws SQLException
    {
    	int choice=0;
    	while(true)
    	{
    		boolean flag=false;
    	
    		System.out.println("Welcome to trainee management");
    		System.out.println("Press 1 for AddTrainee");
    		System.out.println("Press 2 for Find Trainee");
    		System.out.println("Press 3 for Remove Trainee");
    		System.out.println("Press 4 for View Trainee");
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
        	case 3: removeTrainee(); break;
				 
        	default:
			App.main(null);

        	}
        	
    	}
    	
    }
    private static void addTrainee() throws SQLException
	{
		/*
		 * int id=0; boolean internalFlag=false;
		 * 
		 * do { System.out.println("Enter the trainee id"); scan=new Scanner(System.in);
		 * try { id=scan.nextInt(); internalFlag=true; } catch (InputMismatchException
		 * e) { // TODO: handle exception System.err.println("Enter numbers"); } }
		 * while(!internalFlag);
		 * 
		 * System.out.println("Enter the trainee name"); String name=scan.next();
		 * System.out.println("Enter the email"); String email=scan.next(); Trainee
		 * trainee=new Trainee(id,name,email);
		 * 
		 * System.out.println(service.addTrainee(trainee)+" added successfully");
		 */
    	 controller=new Controller();
    	 boolean flag1=false;
    	Trainee t1;
    	int num=0;
    	String name;
    	String email;
    
    	 System.out.println( "Enter Trainee Details - (Id,Name,email)" );
    	 do {
    			scan=new Scanner(System.in);
    	System.out.println("Enter ID:");
    	try {
    		num=scan.nextInt();
    		flag1=true;
    	}
    	catch (InputMismatchException e) {
			// TODO: handle exception
    		System.err.println("Enter in digits please");
		}
    	 }
    	 while(!flag1);
    	System.out.println("Enter Name:");
    	name=scan.next()+scan.nextLine();
    	System.out.println("Enter Email:");
    	email=scan.next()+scan.nextLine();
    	
    	Trainee trainee=new Trainee(num,name,email);
    	try {
    	Trainee addedTrainee=controller.addTrainee(trainee);
    	System.out.println("Trainee Added "+addedTrainee);
    	
    	}
    	catch (Exception e) {
    		
			System.out.println("Error...");
			e.printStackTrace();
		}
   
		
	}
    private static void findTrainee() throws SQLException
	{
		int id=0;
		controller =new Controller();
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
		
		if(controller.findTrainee(id)!=null)
		{
			System.out.println("Trainee found");
		}
		else {
			System.out.println("Trainee not found");
		}
		
	}
    private static void removeTrainee() throws SQLException
  	{
  		int id=0;
  		controller =new Controller();
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
  		
  		if(controller.removeTrainee(id)==true)
  		{
  			System.out.println("Trainee found");
  		}
  		else {
  			System.out.println("Trainee not found");
  		}
  		
  	}
	

    	
    
}

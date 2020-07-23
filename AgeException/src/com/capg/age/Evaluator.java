package com.capg.age;

import java.util.Scanner;

public class Evaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age of person");
		int n;
		n=scanner.nextInt();
		try {
			if(n<=15)
			{
				throw new AgeEvaluatorException("Age of the person must be greater than 15");
			}
			else 
			{
				System.err.println("Age of the person valid age");
			}
		} catch (AgeEvaluatorException e) {
			// TODO: handle exception
		System.err.println("ERROR..."+e.getMessage());
		}

	}

}

package com.cg.eis.exception;

import java.util.Scanner;

public class SalaryEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee salary:");
		double salary=scan.nextDouble();
		ValidateSalary obj=new ValidateSalary();
		try {
			int flag=obj.salary(salary);
			if(flag==1) {
				System.out.println("Employee salary is : "+salary);
			}
		}catch (Handling e) {
			System.err.println("ERROR.."+e.getMessage());
		}

	}

}

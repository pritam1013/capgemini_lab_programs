package com.cg.eis.exception;

public class ValidateSalary {
	public int salary(double sal) throws Handling {
		int flag=0;
		if(sal<3000) {
			throw new Handling("salary is < 3000");
		}
		else {
			flag=1;
		}
		return flag;
		
	}
}

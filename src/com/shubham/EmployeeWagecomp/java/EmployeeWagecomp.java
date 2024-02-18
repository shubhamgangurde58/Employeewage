package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {
		
		int dailywage = 0;
		int attendance = 0 ;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_WAGE = 8;
		System.out.println("Welcome to Employee Wage Compulatiopn");
		
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		if(attendance == 0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
			dailywage = FULL_DAY_WAGE * WAGE_PER_HR;
			System.out.println("DailyWage="+dailywage);
		}
	}
}
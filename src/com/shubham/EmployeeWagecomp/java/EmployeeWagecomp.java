package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {
		
		int employee_type = 0;
		int dailywage = 0;
		int attendance = 0 ;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_WAGE = 8;
		final int PART_TIME_WAGE = 4;
		System.out.println("Welcome to Employee Wage Compulatiopn");
		
		Random random = new Random();
		attendance = random.nextInt(9) % 2;
		if(attendance == 0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			employee_type = random.nextInt(9) % 2;
			if(employee_type == 0)
			{
				System.out.println("Employee is partTime");
				dailywage = PART_TIME_WAGE * WAGE_PER_HR;

			}
			else
			{
				System.out.println("Employee is fullTime");
				dailywage = FULL_TIME_WAGE * WAGE_PER_HR;
			}

			System.out.println("DailyWage="+dailywage);
		}
			
	}

}		
package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {
		
        int full_mouth_wage = 0;
		int employee_type = 0;
		int dailywage = 0;
		int attendance = 0 ;
		final int WORKING_DAYS = 20;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_WAGE = 8;
		final int PART_TIME_WAGE = 4;
		System.out.println("Welcome to Employee Wage Compulatiopn");
		
		for(int i=1;i<=WORKING_DAYS;i++)
		{
			System.out.println("DAY="+i);
			Random random = new Random();
			attendance = random.nextInt(9) % 2;
				switch(attendance)
				{
				case 0:
					System.out.println("Employee is Absent");
					break;
				case 1:
					employee_type = random.nextInt(9) % 2;
					System.out.println("employee is Present");
						switch(employee_type)
						{
						case 0:
							System.out.println("Employee is partTime");
							dailywage = PART_TIME_WAGE * WAGE_PER_HR;
						    break;
						case 1:
							System.out.println("Employee is fullTime");
							dailywage = FULL_TIME_WAGE * WAGE_PER_HR;
							break;
						}
						 
						System.out.println("DailyWage="+dailywage);
						full_mouth_wage += dailywage;
						break;
				}
				System.out.println("-------------------------");
			}
		       System.out.println("full_mouth_wage="+full_mouth_wage);
		}
}		
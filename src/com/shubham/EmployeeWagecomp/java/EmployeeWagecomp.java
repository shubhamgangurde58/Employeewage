package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	 int full_mouth_wage = 0;
		int employee_type = 0;
		int dailywage = 0;
		int attendance = 0 ;
		int total_working_hr = 0;
		int WORKING_DAYS = 1;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME_WAGE = 8;
		final int PART_TIME_WAGE = 4;
		
		public void employeewagecalc() {
		System.out.println("Welcome to Employee Wage Compulatiopn");
		
		Random random = new Random();
		while(total_working_hr <= 100 && WORKING_DAYS <= 20 )
		{
			System.out.println("DAY="+WORKING_DAYS);
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
							total_working_hr += PART_TIME_WAGE;
						    break;
						case 1:
							System.out.println("Employee is fullTime");
							dailywage = FULL_TIME_WAGE * WAGE_PER_HR;
							total_working_hr +=  FULL_TIME_WAGE;
							break;
						}
						 
						System.out.println("DailyWage="+dailywage);
						full_mouth_wage += dailywage;
						break;
				}
				System.out.println("-------------------------");
				WORKING_DAYS++;
			}
		       System.out.println("Total_Working_hr="+total_working_hr);
		       System.out.println("full_mouth_wage="+full_mouth_wage);
		}
		public static void main(String[] args) {
		
			EmployeeWagecomp employeeWagecomp = new EmployeeWagecomp();
					employeeWagecomp.employeewagecalc();
		}
}		
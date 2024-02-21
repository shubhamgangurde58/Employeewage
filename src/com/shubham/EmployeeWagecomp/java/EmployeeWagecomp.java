package com.shubham.EmployeeWagecomp.java;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWagecomp {

	 	int full_mouth_wage = 0;
		int employee_type = 0;
		int dailywage = 0;
		int attendance = 0 ;
		int total_working_hr = 0;
		int working_day = 1 ;
		final int FULL_TIME_WAGE = 8;
		final int PART_TIME_WAGE = 4;
		int monthly_working_day;
		int monthly_working_hr;
		int wage_per_hr = 0;
		
		
		public EmployeeWagecomp(int monthly_working_day,int monthly_working_hr,int wage_per_hr) {
			
				this.monthly_working_day = monthly_working_day;
				this.monthly_working_hr = monthly_working_hr;
				this.wage_per_hr  = wage_per_hr;
			}
		
		public void employeewagecalc() {
			
			System.out.println("Welcome to Employee Wage Compulatiopn");
			
			Random random = new Random();
			while(total_working_hr <= monthly_working_hr && working_day <= monthly_working_day )
			{
				System.out.println("DAY="+ working_day );
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
								dailywage = PART_TIME_WAGE * wage_per_hr;
								total_working_hr += PART_TIME_WAGE;
							    break;
							case 1:
								System.out.println("Employee is fullTime");
								dailywage = FULL_TIME_WAGE * wage_per_hr;
								total_working_hr +=  FULL_TIME_WAGE;
								break;
							}
							 
							System.out.println("DailyWage="+dailywage);
							full_mouth_wage += dailywage;
							break;
					}
					System.out.println("-------------------------");
					working_day++;
				}
			       System.out.println("Total_Working_hr="+total_working_hr);
			       System.out.println("full_mouth_wage="+full_mouth_wage);
			}
			public static void main(String[] args) {
			
				EmployeeWagecomp employeeWagecomp= new EmployeeWagecomp(20,100,20);
				employeeWagecomp.employeewagecalc();
					
				EmployeeWagecomp employeeWagecomp2= new EmployeeWagecomp(25,120,30);
				employeeWagecomp2.employeewagecalc();

			}
}		
package com.shubham.EmployeeWagecomp.java;

import java.util.Random;

public class EmployeeWagecomp {

	public static void main(String[] args) {
		
		int attendance = 0 ;
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
		}
	}
}
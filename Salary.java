package com.codegnan.day8;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter exp:");
	int exp = sc.nextInt();
	System.out.println("Enter score:");
	int score = sc.nextInt();
	int sal=0;
	if(exp<2) {
		sal=30000;
	}else {
		if(exp<6) {
			sal=50000;
		}else {
			sal=70000;
		}
	}
	if(score>7) {
		sal+=(sal*0.1);
	}
  System.out.println("₹"+sal);
  sc.close();
}

}
/*Employee Salary and Bonus Calculation
Problem:
An employee’s salary is calculated based on their performance, years of experience,
and whether they are eligible for a bonus. The rules for the calculation are:
Base Salary:
Junior (Less than 2 years): ₹30,000
Mid-level (2 to 5 years): ₹50,000
Senior (More than 5 years): ₹70,000 

Bonus:
Employees with a performance score of 8 or above get a 10% bonus on their salary.*/

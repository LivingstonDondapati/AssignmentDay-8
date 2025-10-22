package com.codegnan.day8;

import java.util.Scanner;

public class TaxPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter income :");
		double income = sc.nextDouble();
		int res =0;
		if (income<=10000) {
	        res =0;
		}else {
			if(income<=50000) {
				res=10;
			}else {
				if(income<=100000) {
					res = 20;
				}else {
					res = 30;
				}
			}
		}
         System.out.println(res+"%");
         sc.close();
	}

}
/*Write a Java program to calculate the tax percentage based on income using nested if–else statements.
 The program should read an integer income and determine the tax percentage as per the rules below:
Income Range (₹)       Tax Percentage
≤ 10,000                0%
10,001 – 50,000         10%
50,001 – 100,000        20%
> 100,000               30%


Test Case 1:
Input:
5000
Output:
0%


Test Case 2:
Input:
20000
Output:
10%
*/
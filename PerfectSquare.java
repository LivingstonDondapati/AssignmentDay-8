package com.codegnan.day8;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number :");
		int num = sc.nextInt();
		if(num>0) {
			int x = (int) Math.sqrt(num);
			
			if(x*x==num) {
				System.out.println(num +" is perfect square");
		}else {
			System.out.println(num+ " is not perfect square");
		}
		
		}else {
			System.out.println(num+ " is not perfect square");
		}
     sc.close();
	}

}
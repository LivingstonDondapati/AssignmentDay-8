package com.codegnan.day8;

import java.util.Scanner;

public class BMINested {

}	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("enter weight");
	double wei = sc.nextDouble();
	System.out.println("enter height");
	double hei = sc.nextDouble();
	double bmi= wei/(hei*hei);
	String res;
	if(bmi<18.5) {
		res="underweight";
	}else {
		if(bmi<24.9 && bmi>=18.5) {
			res="normal";
		}else {
			if(bmi<29.9 && bmi>=24.5) {
				res="overweight";
			}else {
				res="obese";
			}
		}
	}
    System.out.println(res);
    sc.close();
}

}

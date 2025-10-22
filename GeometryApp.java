package com.codegnan.day8;

import java.util.Scanner;

public class GeometryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println("enter c");
		int c = sc.nextInt();
		System.out.println("enter d");
		int d = sc.nextInt();
		String res;
		if(a==c && b==d && a!=b ) {
			res="rectangle";
		}else {
			if(a==b&& b==c && c==d) {
				res="square";
			}else {
				res="other";
			}
		}
			System.out.println(res);
			sc.close();

	}

}
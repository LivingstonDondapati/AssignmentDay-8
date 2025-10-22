package com.codegnan.day8;

import java.util.Scanner;

public class TrafficLIght {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter light :");
		System.out.println("enter hours :");
		String light= sc.next();
		int hour = sc.nextInt();
		boolean daytime=(hour>=6 && hour<=18);
		String action ;
		if(light.equalsIgnoreCase("green")) {
			action="Go";
		}else {
			if(light.equalsIgnoreCase("red")) {
				action="stop";
			}else {
				if(light.equalsIgnoreCase("yellow")) {
					if(daytime) {
					    action="slow";
					}else {
						action="stop";
					}
				}else {
					action="Invalid light state";
				}
			}
		}
		System.out.println(action);
		sc.close();
	}
	}

package com.codegnan.day8;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter vehicle : ");
		String vehicle = sc.next();
		System.out.println("enter time :");
		int arrival = sc.nextInt();
		System.out.println("enter dep time : ");
		int departure = sc.nextInt();
		int price = 0;
		int time=departure-arrival;
		if(vehicle.equalsIgnoreCase("car")) {
			price=50*time;	
		}else if(vehicle.equalsIgnoreCase("bike")) {
			price=30*time;
		}else if( vehicle.equalsIgnoreCase("truck")) {
			price=100*time;
		}else {
		  System.out.println("invalid");
		}
		if(time>5) {
			price*=0.8;
		}
        if((time>=18 && time<=24)||(time>=1 && time<=8)) {
        	price=price+(price/2);
        }
        System.out.println(price);
        sc.close();
	}

}
/*Problem: Parking Fee Calculation
A parking system calculates the fee based on the following conditions:

Vehicle Type:
Car: ₹50 per hour
Bike: ₹30 per hour
Truck: ₹100 per hour


Discounts:
If the vehicle stays for more than 5 hours, a 20% discount is applied to the total parking fee.

Surcharge:
If the vehicle is parked between 6 PM and 8 AM, a 50% surcharge is applied to the total fee.

Input:
The program should prompt the user to enter the vehicle type (Car, Bike, or Truck).
The user should enter the arrival time (24-hour format, e.g., 14 for 2 PM).
The user should also enter the departure time (24-hour format, e.g., 18 for 6 PM).


Output:
The program should output the total parking fee based on the conditions above.

Constraints:
Assume that the parking times are in a 24-hour format.
Handle cases where parking times cross midnight (e.g., a vehicle parked from 10 PM to 2 AM).
For vehicles staying for more than 5 hours, apply the 20% discount.
For vehicles parked between 6 PM and 8 AM, apply the 50% surcharge.


Example:
Input:
Enter the vehicle type (Car, Bike, Truck): car
Enter the time of arrival (24-hour format, e.g., 14 for 2 PM): 14
Enter the time of departure (24-hour format, e.g., 18 for 6 PM): 20*/

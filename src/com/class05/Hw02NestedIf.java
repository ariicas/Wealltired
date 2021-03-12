package com.class05;

import java.util.Scanner;

public class Hw02NestedIf {

	public static void main(String[] args) {
		
		
		 Scanner input= new Scanner(System.in);
		 System.out.println("Please enter your first number");
		 int  a=input.nextInt();
		  
		 System.out.println("Please enter your second number");
		 int b=input.nextInt();
		 
		 System.out.println("Please enter your third number");
		 int c=input.nextInt();
		 	int largest;
		 	
		 	if (a >b) {
				if (a > c) {
					largest = a;
				} else {
					largest = c;
				}
			} else if (b > a) {
				if (b > c) {
					largest = b;
				} else {
					largest = c;
				}
			} else {
				largest = b;
			}
			System.out.println("The largest number is " + largest);
	
	
	}	 
}
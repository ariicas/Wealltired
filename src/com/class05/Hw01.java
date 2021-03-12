package com.class05;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[]args) {
		
		//write a program to find the largest of three double
		//values using if -else..if and logical operator provided
		// a user  (number must be distinct. 
		
		 Scanner input= new Scanner(System.in);
		 System.out.println("Please enter your first number");
		 int  a=input.nextInt();
		  
		 System.out.println("Please enter your second number");
		 int b=input.nextInt();
		 
		 System.out.println("Please enter your third number");
		 int c=input.nextInt();
		 	int largest;
		 
		 if (a>b && a>c) {
			 largest=a;
		 }else if (b>a&& b>c) {
			 largest=b;
		 }else 
			 largest=c;
		 
		 System.out.println("The number that is greater "+largest);
		 
	}
}

package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int height;
		Scanner input;
		
		input=new Scanner(System.in);

		System.out.println("Please enter your height");
		height=input.nextInt();
		
		if (height<=60){
			System.out.println(" You are short"); 
		}else if (height>=61 && height<=72) {
		System.out.println(" You are medium ");
		}else {
		System.out.println("You are tall");
	}
	
		System.out.println("______________________________________________________");
	
	///task 2 
		Scanner scan1;	
	
		scan1= new Scanner(System.in);

	    System.out.println("What day is today?");
		int day=scan1.nextInt();
	
		
	
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
}	
}   



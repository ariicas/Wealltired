package com.class04;

import java.util.Scanner;

public class Hw04 {

	public static void main(String[] args) {
		///Exercise #1 Scanner if/else
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your loan amount");
		
		int num1=scan.nextInt();
		if (num1<200000) {
			System.out.println("We can lend you the loan");
		}else {
			System.out.println("We can not lend you the loan");
		}
		System.out.println("-------------------------------------------------------");
		
		//Exercise #2 Scanner if/else
		Scanner input=new Scanner(System.in);
		System.out.println("How old are you? ");
		
		int age=scan.nextInt();
		if (age>18) {
			System.out.println("We can issue your driver license");
		}else {
			System.out.println("You will need to get your learners permit first");
		}
		System.out.println("---------------------------------------------------------");
		
		//Exercise #3 Scanner If/else
		
		Scanner info=new Scanner(System.in);
		System.out.println("Hello, what city do you live in");
		
		String city=info.nextLine();
		System.out.println("What is the temperature in Fahrenheit");
		
		double temp=info.nextInt();
		
		double tempCel=((temp-32)/1.8);
		System.out.println("The temperature in "+city+" is "+tempCel+" degrees celcius ");
	}
}

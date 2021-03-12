package com.class08;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Task {

	public static void main(String[] args) {
		//task 1
		// Print numbers from 1 to 50 expect those that are divisible by 3;
		
		for(int i=1; i<=50; i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
			
			
		}
		System.out.println();
		System.out.println("==================================================================================");
		
		/*
		 * Task 2
		 * Create a program that will keep asking user to apply for the credicard
		 * As soon you get "yes" from a user program should stop asking
		 */
		
		Scanner input= new Scanner(System.in);
		boolean iWould=true;
		
		do {
			System.out.println("Would you like to apply to a credit card?");
			iWould=input.nextBoolean();
			
		}while(!iWould); {
			System.out.println("You are qualified");
			
		}
		System.out.println();
		System.out.println("==================================================================================");
		
		
	}
}

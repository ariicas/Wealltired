package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * we need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3.00
		 * 
		 * if user gives more than 3--> please give less money
		 * if user give less than 3---> please give more money 
		 */
		
		Scanner input;
		int soda;
		
		input=new Scanner(System.in);
		
		do {
		System.out.println("Please pay for your soda");
		soda=input.nextInt();
		
		if (soda<3) {
			System.out.println("Please give more money!");
		}else if (soda>3) {
			System.out.println("Please give me less money");
		}
		}while (soda!=3);
		System.out.println("Thank you for your purschase");
	}

}

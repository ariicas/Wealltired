package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		
		Scanner input;
		int soda;
		
		input=new Scanner(System.in);
		
		
		System.out.println("Please pay for your soda");
		soda=input.nextInt();
		
		while (soda !=3) {
		if (soda<3) {
			System.out.println("Please give more money!");
		}else if (soda>3) {
			System.out.println("Please give me less money");
		}
		soda=input.nextInt();
		
	}
		System.out.println("Thank you for your purschase");
	
	}

}

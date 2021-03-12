package com.class06;

import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		int total, num2,num02;
		char operator = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num2=scan.nextInt();
		num02=scan.nextInt();
		System.out.println("Please enter one operator?");
		operator=scan.next().charAt(operator);
		
		switch (operator) {
		
		case '+':
			total=(num2+num02);
			break;
		case '-':
			total=(num2-num02);
			break;
		case '/':
			total=num2/num02;
			break;
		case '*':
			total=num2*num02;
			break;
			default:
				total=0;
				System.out.println("operator not found!"); {
				
				}
				if (total!=0);
		}

	System.out.println("When you enter "+num2+ " and "+ num02+" you  use "+operator+" your total will be "+total);
	}

}

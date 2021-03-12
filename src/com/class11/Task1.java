package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array on double values using scanner
		 * calculate the sum of all stored elements in that array 
		 */

		Scanner input;
		
		double sum=0;
		
		input= new Scanner(System.in);
		System.out.println("Please enter how many elements you would like to store");
		int size=input.nextInt(); //scanner code
		double [] nums =new double[size]; //insert array code 
		
		for(int i=0; i<size; i++) { //for loop 
			nums [i]=input.nextDouble(); //scanner code to get the numbers
			sum+=nums[i]; //sum code
	}
		System.out.println("Your total value is " + sum);
	
		System.out.println("------------Calculating sum using for each loop-----");
		sum=0;
		
		for(double num:nums) { //advanced code for array loop 
			sum+=num;
		}
		System.out.println("Your total value is "+ sum);
	}
}

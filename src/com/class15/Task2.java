package com.class15;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//		// Write a program that reads two people's first  names and if they expecting boy or girl? 
//				Based on the input suggests a name for a baby: 
//				Example Output:                                                 Example Output:
//				Mom's first name? Mary											Mom's first name? Mary
//				Dad's first name? Daniel				     					Dad's first name? Daniel
//			    Boy or Girl? boy												Boy or Girl? girl
//					Suggested baby name: DANRY									Suggested baby name: MAIEL
//				
				Scanner input= new Scanner(System.in);
			
				System.out.println("What is moms first name?");
				String momsFirstName=input.nextLine();
				System.out.println("What is dad first name?");
				String dadsFirstName=input.nextLine();
				System.out.println("What is the gender of the baby?");
				String gender=input.nextLine();
				
				if(gender.equalsIgnoreCase("Boy")) {
					System.out.println("Suggested baby name: \n "+dadsFirstName.toUpperCase().substring(0,3)+momsFirstName.toUpperCase().substring(2,4));
					
				}else if(gender.equalsIgnoreCase("Girl")) {
					System.out.println("Suggested baby name: "+momsFirstName.toUpperCase().substring(0,2)+dadsFirstName.toUpperCase().substring(3,6));
				}

	}

}

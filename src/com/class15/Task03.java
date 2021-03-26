package com.class15;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		System.out.println("========================================Task3=======================================================================");
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter a String?");
		String stuff=input.nextLine();
			if(!stuff.isEmpty()) {
			   if(stuff.length()%2==1 && stuff.length()>=3) {
				   int stuff1=stuff.length()/2;
				   System.out.println("The middle character of this string is: \n "+stuff.charAt(stuff1));
				}else {
					System.out.println("This string has even number of characters");
				}
			   
			}else {
				System.out.println("string is empty");
					
			}
			
			System.out.println("=========================================Task4======================================================================");
			//Create a String and print it in reverse order (Sunday/yadnuS).
			
			String name="Sunday";
			for(int i=name.length()-1; i>=0; i--) {
				System.out.print(name.charAt(i));//easier way for an array 
			
	}
	}
}

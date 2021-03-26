package com.class15;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 //
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please enter a username");
		 String out =input.nextLine();
		 
		 System.out.println("Please enter a password");
		 String pass=input.nextLine();
		 
		 System.out.println("Please confirm password ");
		 String pass2=input.nextLine();
		 
		 if (out.isEmpty() || pass.isEmpty()) {
			 System.out.println("Username and Password cannot be empty");
		 }else {
			 System.out.println("Please continue creating your password");
		 }
		 
		 if (pass.length()<8) {
			 System.out.println("Password is too short");
		 }else {
			 System.out.println("Password meets the 8 minimum characteritcs");
		 }
		 
		 if(pass.contains(out)) {
			 System.out.println("Password can not contain username");
		 }else {
			 System.out.println("Good, your password does not contain the username");
		 }
		 
		 if(pass.equals(pass2)) {
			 System.out.println("Both of your password match, your account has been created!"); 
		 }else {
			 System.out.println("But both password do not match, try again!");
			
		 }
		 
		 //WORK ON THIS AND ALSO COPY ASGHAR EXAMPLE 
	}
}

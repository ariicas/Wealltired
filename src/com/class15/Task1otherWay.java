package com.class15;

import java.util.Scanner;

public class Task1otherWay {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the user name");
		String userName = input.nextLine();
		System.out.println("Please enter the password");
		String pass = input.nextLine();
		System.out.println("Please rewrite the password");
		String pas1 = input.nextLine();
		
		if(userName.isEmpty()|| pass.isEmpty()) {
				System.out.println("Username or password cannot be empty");
		}else if(pass.length()<8) {
				System.out.println("Password is too short");
		}else if(pass.contains(userName)) {
				System.out.println("password cannot contain Username");
		}else if(!(pass.equals(pass))) {
				System.out.println("Passwords dont match");
				
		}else {
				System.out.println("Your username and password are created");
 

	}
	}
}

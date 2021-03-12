package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*we need to idetinfy favorite food 
		 * 
		 * we need to capture country from a user
		 * based on the country we identify favorite food. 
		 */
		
		Scanner input;
		String country,food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "usa":
			food="Burger";
			break;
		case "afghanstan":
			food="Kebab";
		case "vietname":
			food="Pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case"pazakstan":
			food="horse";
			break;
		case"Belarus":
			food="draniki";
			break;
		case"Tajisktan":
			food="plov";
			break;
		case"Mexico":
			food="tacos";
			break;
		default:
			food="Unknown";
		}
		
		System.out.println("Your favorite food is "+food);
	}

}

package com.class06;

import java.util.Scanner;

public class Hw01 {
	public static void main(String[]args ) {
		
		
		Scanner input;
		String country,language;
		input=new Scanner(System.in);
		
		
		System.out.println("Where are you from? ");
		country=input.next();
		
		switch (country) {
		
		case "Ecuador":
			language="Spanish";
			break;
		case "Vietnam":
			language="Viatnamese";
			break;
		case "Italy":
			language="Italian";
			break;
		case "Iran":
			language="Farsi";
			break;
		case "Brazil":
			language="Portuguesse";
			break;
		case"Japan":
			language="Japanesse";
			break;
		default:
				language="Unknown";
		}
		
		System.out.println("If you are from "+country+" you speak "+language);
	}

}

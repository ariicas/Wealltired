package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String month;
		String season;
		
		System.out.println("What month were you born in?");
		month=input.next();
		
		if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")) {
		
		season="Spring"; 
			
		}else if (month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
		
		season="Summer"; 
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")) {
		
		season="Fall"; 
		
		}else  
			season="Winter";
	
		System.out.println("You were born in "+season);

}
}

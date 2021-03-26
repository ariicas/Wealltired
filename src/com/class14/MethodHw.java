package com.class14;

public class MethodHw {
 
	/*
	 * Create  class Student that will have a method getGrade. 
	 * Your method should accept the score of a student and return a grade:
	score > 90 - A
	score >80 - B
	score >70 - C
	score > 50 - D
	anything else - F
	 */
	
	String getGrades (int y) {
		
		if(y>=90) {
			return "A";
		}else if (y>=80) {
			return "B";
		}else if (y>=70) {
			return "C"; 
		}else if (y>=50) {
			return "D";
		}else {
			return "F";
		}
		
	}
	/*
	 * Create a method that will say Hello in different language based on the country 
	 * that will passed when method is executed.
	 */
	
	String countries(String country) {
		String helloo;
		switch(country) {
		case "Uruguay":
		helloo="Hola";
		break;
		case "Italy":
		helloo="Ciao";
		break;
		case"France":
		helloo="Bonjour!";
		break;
		default:
			helloo="try again";
		}
		return helloo;
	}
	boolean isPrime;
	boolean itsPrime (int a) {
		if(a<1)
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime=true;
			}else {
				isPrime=false;
			}
			
		}
			return isPrime;
	}
}
       
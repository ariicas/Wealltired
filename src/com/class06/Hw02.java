package com.class06;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		
		Scanner scan;
		char grade = 0;
		String explanation;
		
		scan=new Scanner(System.in);
		
		System.out.println("What grade did you get on your test?");
		grade=scan.next().charAt(grade);
		
		switch (grade) {
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Below Average";
			break;
		case 'F':
			explanation="Failed";
			break;
		default:
			explanation="Need to study more";
			
		}
		System.out.println("If you got an  "+grade+" on you test, than you did "+ explanation);
	}

}

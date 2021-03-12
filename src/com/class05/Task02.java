package com.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String [] args) {
		
	
		Scanner score=new Scanner(System.in);
		int quiz, midterm, finalScore, total;
		char grade;
		
		System.out.println("Please Enter your quiz score");
		quiz=score.nextInt();
		
		System.out.println("Please Enter your midterm score");
		midterm=score.nextInt();
		
		System.out.println("Please Enter your final score");
		finalScore=score.nextInt();
		
		total =(quiz+midterm+finalScore)/3;
		
		if (total>=90) {
			grade='A';  
		}else if (total>=70 && total<90) {
			grade='B';
		}else if (total>=50 && total<70) {
			grade='C';
		}else {
			grade='D';
		}
		 System.out.println(" Your grade is "+grade);
		
	
		
		
		
		
		
		
		
		
		
	}
}

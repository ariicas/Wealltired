package com.class04;

import java.util.Scanner;

public class NestedIfMyHelp {

	public static void main(String[] args) {
	
//		/*
//		 * 
//		 * 
//		 * Create a program that prompt user with question: "Do you need a loan?"
//
//If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
//
//Based on the score define users eligibility:
//
//if score is below 600 --> eligibility = "Not eligible"
//if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
//if score is between 701 and 800 inclusive --> eligibility = "Eligible"
//if score is higher than any other previous values --> eligibility = "Definitely eligible" .
//		 */
//			int score;
//			String result = null;
//			boolean loan;
//		Scanner input=new Scanner(System.in);
//		
//		System.out.println("Do you need a loan?");
//		loan=input.nextBoolean();
//		System.out.println("What is your credit score?");
//		score=input.nextInt();
//		
//		if (loan) {
//			if (score<600) {
//			       result="Not eligible"; 
//			       }  else if (score<=600 && score<=700) {
//			       result="Maybe eligible"; 
//			     } else if (score<=701 && score<=800) {
//			       result="Eligible"; 
//			        } else if (score>801) {
//			           result="Definitely eligible";
//			        }
//			   
//			         } else {
//			             result="Unknown";	
//		}  
////		
////			
//	
////	System.out.println(result);
//	
//		 int age=0;
//	      char gender 'F','M';
//	      String result;
//	    Scanner input=new Scanner(System.in);
//
//	    System.out.println("Please enter your gender");
//	      gender=input.next().charAt(gender);
//	       System.out.println("Please enter your age");
//	      age=input.nextInt();
//
//	      if (gender=='F') {
//	        if (age>25) {
//	          result="Woman";
//	        }else {
//	          result="Man";
//	          if (age<25) {
//	            if(gender=='F') {
//	              result="Girl";
//	            }else {
//	              result="Boy";
//	            }
//	          }
//	         
//	        }
//	        
//	        System.out.println("If you are "+gender+" and "+age+"than"+result);
//	      }
	
	      
//	      If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
//
//	      If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
     
		
		   int age=0;
		      char gender= 0;
		      String result;
		    Scanner input=new Scanner(System.in);

		       System.out.println("Please enter your age");
		      age=input.nextInt();
		      
		      if (age>25) {

				    System.out.println("Please enter your gender: M or F");
				      gender=input.next().charAt(gender);
				 if(gender=='F');
				 	result="Woman";
		      }else {
		    	  result="Girl";
		      if (age<=25) {
		    	  result="Boy";
		    	  }else {
		    		  result="Men";
		    	  }
		      }
		
		
		
		System.out.println(result+gender+age);
		
		
		
		
		
		
		
		
		
		
       }
	}

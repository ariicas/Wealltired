package com.class06;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
	

	    int score;
	    boolean loan=true;
	    String result=null;
	   Scanner input=new Scanner(System.in);

	   System.out.println("Do you need a loan?"); 
	    loan=input.nextBoolean();
	  System.out.println("What is your credit score?");  score=input.nextInt();
	   

	   if (loan) { 
	      if (score<600) {
	       result="Not eligible"; 
	       }  else if (score<=600 && score<=700) {
	       result="Maybe eligible"; 
	     } else if (score<=701 && score<=800) {
	       result="Eligible"; 
	        } else if (score>801) {
	           result="Definitely eligible";
	        }
	
	         
	         
	         }    else {
        result="Unknown";    
			         }
	
	}
}

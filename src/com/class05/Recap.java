package com.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
			Scanner anyVariableName;
		
		 anyVariableName=new Scanner (System.in);
		
		//to capture entire sentence 
		  String sentence=anyVariableName.nextLine();
		 System.out.println(sentence);
		 
		 //to capture number
		 int num=anyVariableName.nextInt();
		 System.out.println(num);
		 
		 //to capture double
		 double d=anyVariableName.nextDouble();
		 System.out.println(d);
		 
//		 //to capture single character
////		 char singleCharacter=anyVariableName.nextchatAt;
//		 System.out.println(singleCharacter);
		 
	}

}

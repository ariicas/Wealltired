package com.class05;

import java.util.Scanner;

public class MyHelp {

	public static void main(String[] args) {
//	//I did this examples to be able to help me; i realize that i need to be careful with my ().
//		
//			Scanner input=new Scanner(System.in);
//			
//			int num1,num2,num3,largest;
//			
//			System.out.println("Please enter first number");
//			num1=input.nextInt();
//			
//			System.out.println("Please enter second number");
//			num2=input.nextInt();
//			
//			System.out.println("Please enter third number");
//			num3=input.nextInt();
//			
//			if (num1>num2) {
//				largest=num1;
//			}else {
//				largest=num2; 
//				if (num2>num3) {
//					largest=num2;
//				}else {
//					largest=num3;
//				}
//			}
//		 System.out.println("this is the greater number"+largest);
//			
//System.out.println("=========================================================================");
//	//////this is an example of using && and else if&& Please check your paranthesis. 
//
//System.out.println("Please enter one number");
//num1=input.nextInt();
//System.out.println("Please enter second number");
//num2=input.nextInt();
//System.out.println("Please enter third number");
//num3=input.nextInt();
//
//	if (num1>num2 && num1>num3) {
//		largest=num1;
//	}else if (num2>num3 && num2>num1) {
//		largest=num2;
//	}else {
//		largest=num3;
//	}
//	System.out.println("Your greatest number is "+largest);
//	
	
	  
	
		   int grade;
	        char letterGrad=0;

	Scanner input=new Scanner(System.in);

	System.out.println("Please enter your mark");
	 grade=input.nextInt();

	if (grade>80) {
	    letterGrad='A'; 
	    }else if (grade>61 && grade<=80) {
	    letterGrad='B';  

	    }else if (grade>51 && grade<=60) {
	      letterGrad='C';
	    }else if (grade>45 && grade<=50) {
	      letterGrad='D';
	    }else if (grade>26 && grade<=45) {
	      letterGrad='E';
	    }else if (grade>=1 && grade<=25) {
	      letterGrad='F'; 

	      }else {
	        System.out.println("Please enter valid mark");
	        
	      }
	    System.out.println("If you get this "+grade+" than your grade is "+letterGrad);
	    
	

	}

}

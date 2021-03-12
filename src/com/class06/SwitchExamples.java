

package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		/*
		 * store gender using M or F
		 * based on the gender we will specify 
		 * if M -->male 
		 * if F-->female 
		 * otherwise -->not sure 
		 */
		
		char gender='F';
		String description;
		switch (gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
		}
		System.out.println(description);
		/*Limitation 
		 * switch Cannot use RELATIONAL or Logical Operators
		 * it simply check value
		 *switch CANNOT WORK with boolean,float,double,long
		 */
		boolean sunny=true;
		if (sunny) {
			System.out.println("I am happy ");
		}
		double price=10.9;;
		
		if (price>10) {
			System.out.println("Too expensive");///it can not work 
			//with double, float,long
		}
//		switch (sunny)/// does not work with boolean 
	}

}

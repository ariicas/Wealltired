package com.class06;

import java.util.Scanner;

public class LogicalRecap {
	public static void main(String[] args) {
		
		/* we need to get time -----the use of scanner 
		 * based on time we need to identify what is the time of day --- used of time;int 
		 * if times is between 1-11-->morning ( the used of if else) (&&)
		 * if time is between 13 to 1-->noon
		 * if time is between 14-17-->to afternoon
		 * if time is 18 to 21--->evening
		 * if time is 22-24-->
		 */
		
		Scanner scan;  //1                     //WE ARE DECLARING OUR VARIABLE 
		int time; //2
		String timeOfTheDay = null;//3
		
		scan=new Scanner(System.in); //1
		System.out.println("Please enter time in 24 hour format");
		time=scan.nextInt();//2
		
		if (time>=1 && time<=11) {
			timeOfTheDay="Morning"; //3
		}else if (time>=12 && time <=13) {
			timeOfTheDay="Noon";		
		}else if (time>=14 && time <=17) {
			timeOfTheDay="Afternoon";
		}else if (time>=18 && time <=21) {
			timeOfTheDay="Evening";
		}else if (time>22 && time <=24) {
			timeOfTheDay="Night";
		
		}
		
		System.out.println("Based on the entered time, time of the day is "+timeOfTheDay);
		
		/* compiler can initiliaze variables to their default values;
		 * default value of int---> 0
		 * default  value of double ---> 0
		 * default value of boolean----> false
		 * default valye of string and all non primitives--->null
		 */
		double d=10;
		System.out.println(d);//10.0
	}

}

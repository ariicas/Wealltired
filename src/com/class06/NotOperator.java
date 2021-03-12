package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rain=false;
		
		if(!rain) {
			System.out.println("I will take my umbrella");
		}
		
		
		boolean boo=!true;
		System.out.println(boo);//false
		
		
		boolean boo1=!false;
		System.out.println(boo1);//false
		
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time");
		}
		
		String day="Monday";
		
		if (!day.equals("Friday"))  {
			System.out.println("Today is not Friday");
		}
		System.out.println("------------------------------------------------------------------------------------");
		boolean homework=true;
		
		if(!homework) {
			System.out.println("I will be happy");
		}
	}

}

package com.class07;

public class HW {

	public static void main(String[] args) {
	//	 calculate sum of odd and even numbers from 1 to 50
			//EVEN 
		
		 int result=0;
		 
		for(int i=0; i<=50; i+=2) {
			result+=i;
		}
	System.out.println("The sum of even numbers is "+result);
	
	System.out.println();
	System.out.println("--------------------------------------");
	
	
		int result1=0;
		
		for (int j=1; j<=50; j+=2) {
			result1+=j;
			
		}
		System.out.println("The sum of odd numbers is "+result1);
	}

}

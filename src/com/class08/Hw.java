package com.class08;

public class Hw {

	public static void main(String[] args) {
	 
		
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

			
			System.out.println();
			System.out.println("--------------------------------------");
			
			int odd=0;
			int even=0;
			
			for (int i=1; i<=50; i++) {
				
				if (i%2==0) {
					even+=i;
				} else {
					odd+=i;
				}
				
				
			}
	
			
	}

}

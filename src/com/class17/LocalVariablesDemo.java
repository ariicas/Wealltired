package com.class17;

public class LocalVariablesDemo {

	
	void printInfo(String name) { //local variable 
		String phoneNumber="123456789";
		System.out.println(name);
		
		
	}
	
	void printInfoWithAddress(String name, String address) {
		System.out.println(name+address);
		// not accessphoneNumber from the previous method. 
	}
	
	
	public static void main(String[] args) {
	
		String name="Local";
		
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}

	}
	
		int x=10;
		{   //inside paranthesis  =local variables
		int y=20;
		System.out.println(x);
		   
		}
		
		
}
		

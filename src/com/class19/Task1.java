package com.class19;

public class Task1 {
	
	String name; //instance variables 
	
	 Task1( ) {
		System.out.println("Constructor without parameters is called");
	}
	
	Task1(String name) {//with parameterers. 
			this.name=name;
			// this.name  was used to turn the local variable into instance variable.
			System.out.println("Cronstructor with parameters is called");


		}
	
	
	

}

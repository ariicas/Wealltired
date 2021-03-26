package com.class18;

import java.util.Scanner;

public class AccessModifierTester {

	public static void main(String[] args) {

		AcessModifierDemo obj1=new AcessModifierDemo ();
		System.out.println(obj1.name);	
		//System.out.println(obj1.BankAccountPassword);	
		System.out.println(obj1.SSNNumber);	
		obj1.accessToPark(); //==> should be able to go another class.
		//Scanner scanner=new Scanner(System.in) {
			
			
		
	}

}

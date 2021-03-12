package com.class12;

public class Hw06 {

	public static void main(String[] args) {
		// write a java program to check wether a given number is prime or not? 
		
			int num=7;
			boolean prime=true;
			
			if(num>1) {
			for(int i=0; i<num; i++) {
					if(num%2==0) {
					prime=false;
					break;
				}
			}
			}else { 
				prime=false;
	}
			if(prime) {
				System.out.println(num+" is a prime number");
			}else {
				System.out.println(num+" is not a prime number");
			}
	}

}

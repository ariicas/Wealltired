package com.class10;

public class Hw {

	public static void main(String[] args) {
		
		
		System.out.println("=======================TASK 1=========================================");
		String[]car={"Ford","Honda","Bmw","Toyota","Ferrari","Porsche"};
		
		for(int i=0; i<car.length;i++) {
			System.out.print(car[i]+" ");
	}
		System.out.println();
		System.out.println("=======================TASK 1 DifferentAdvance  ForLoop========================================");
		for ( String a:car) {
			System.out.print(a+" ");
		}
	       
	     	
	}
}

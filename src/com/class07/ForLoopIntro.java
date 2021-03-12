package com.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
	  
		for(int i=0; i<3; i++) {
			System.out.println("Hello");
		}
		
		
		System.out.println("-----------------------PRINT NUMBER FROM 1 TO 50----------------");
		
		for(int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------PRINT NUMBER FROM 10 TO 1----------------");
		
		for(int i=10; i>=1; i--) {
			System.out.print(i+ " ");
			
		}
		
		System.out.println();
		System.out.println("-----------------------What is my output----------------");
		
		for( int a=1; a<=10; a+=2) {
		
			System.out.print(a+" ");
			
		}
	System.out.println("-----------------------What is my output----------------");
		
		for(int i=5; i<=50; i+=10) {
			System.out.print(i+" ");
		}
	}

}

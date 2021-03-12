package com.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			
			System.out.print("*");
			
			System.out.println();
		}

	System.out.println("=========================================================================");
		
		for(int r=1; r<=4; r++) {
			for (int c=1; c<=5; c++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========================================================================");
		
		for(int i=1; i<=6; i++) {
			for (int j=1; j<=8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=========================================================================");
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		

	System.out.println("========================numbers square=================================================");
	  for(int i=1; i<=5; i++) {
		for (int j=1; j<=5; j++) {
			System.out.print(i+" ");
	}
			System.out.println();
			
		}	
	
		 
		System.out.println("=========================other square================================================");
		
		for(int r=6; r>=1; r--) {
			for(int c=6; c>=1; c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	System.out.println("=========================================================================");
		
		for(int a=1; a<=5; a++) {
			for (int b=6; b>=1; b--) {
		System.out.print(a+" ");
	}
			System.out.println();
		}	
		System.out.println("=========================================================================");
		for(int r=1;r<=6;r++) {
			for(int c=1; c<r;c++) {
				System.out.print("* ");
			}System.out.println();


		}

	}
}

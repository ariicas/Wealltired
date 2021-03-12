package com.class07;

public class Task02 {

	public static void main(String[] args) {
	
		for(int i=1; i<=100; i++) {
		
		System.out.print(i+"  ");
		
		
	}
		System.out.println();
		System.out.println("------------------------------------------");
		
		for(int i=100;  i>=1; i--) {
		System.out.print(i+ " ");
	}
		System.out.println();
		System.out.println("------------------------------------------");
		
		/*
		 * print odd numbers between 20 and 50 (2 ways)
		 */
		for (int i=20; i<=50; i++) {
			if(i%2==1) {
				System.out.println(i+" ");
			}
			
			System.out.println();
			System.out.println("------------------------------------------");
			
			for(int j=21; j<=50; j+=2) {
				System.out.print(j+" ");
			}
		}
	}
}

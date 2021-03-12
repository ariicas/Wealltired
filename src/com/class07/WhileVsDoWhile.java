package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int num=6;
		
		while(num<=5) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("---------------------------- DO WHILE------------------------");
		
		
		int num1=6;
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<5);
		
		/*
		 * 
		 * while= first check then execute 
		 * Do=first execute then check 
		 * Even when condition is false it will execute at least once;
		 */
	}

}

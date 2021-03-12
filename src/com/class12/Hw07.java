package com.class12;

public class Hw07 {

	public static void main(String[] args) {
		// write a java program to print the first 10 fibanashi 
		// the sum of two previously numbers
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<10; i++) {
			
			System.out.print(a+" ");
			c=a+b; // 0+1=1 now c=1;
			a=b;// 1
			b=c; //1=1
			
			{			
			int f1=0;
			int f2=1;
			
				for(int f=1; f<20; f++) {
					System.out.print(f1+" ");
					f1=f1+f2;
					f2=f1-f2;	
				}
			
			System.out.println();
		}

	}
	}
}

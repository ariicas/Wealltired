package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [] [] num=new int [3][4];
		
		//1 array or 1 row
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		//2 array or 2 row
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//3 array or 3 row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		System.out.println(num[1][3]); //40
		System.out.println(num[2][3]); //300
		
		System.out.println("---------------------Another way of creating a 2D array-----------------------------------------------------");
		
		
		int[][] number= {
				{1, 2, 3, 4},
				{10, 20, 30,40},
				{100, 200, 300, 400},
				
		};
		System.out.println(number[0][2]); //3
		System.out.println(number[1][1]); //20
		
		//what is the output?
		
		int sum= number[1][2]+ number[0][3];
		System.out.println(sum);
		
//		//what is the output?
//		System.out.println(number[0][4]);//// Array IndexOutofBoundsExeception:4
		
		number[2][2]=500;
		System.out.println(number[2][2]);
	}

}

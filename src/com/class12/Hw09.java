package com.class12;

public class Hw09 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array??
		//Please DEBUG TO UNDERSTAND 
		 
int[]arr2= {900, 900, 10,20,3,45,89,76,45,125,367,145};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]>large) { //900 >900
				secondLarge=large;
				large=arr2[i];
				
			}else if(arr2[i]>secondLarge&&arr2[i]!=large) { //900 >0 && 900 not equal to 900
				secondLarge=arr2[i];
			}
			
		}
		System.out.println("The largest number "+large);
		System.out.println("2nd largest number is "+secondLarge);
		

	}

}

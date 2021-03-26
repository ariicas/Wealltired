package com.class18;

public class Task2 {

/*
 * 	Create a method that will take a String as a parameter and returns reversed String.
 *  Method should be available to all classes within
 *   your project and accessible by class name. (static)
 *   static method== no need to create obj.
 *   //all class =public 
 */					 	//name of method	//argument
	public static String reverseString(String str) {
		String str2=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);    //array way.
		}
		 return str2;
		
	}
	
	
}

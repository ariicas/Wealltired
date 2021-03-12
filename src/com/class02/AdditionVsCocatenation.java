package com.class02;

public class AdditionVsCocatenation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);//21HelloHi
		System.out.println(num1+str1+num2+str2);//10Hello11Hi
		
		System.out.println(str1+str2+num1+num2);
		//two string and int after it equal a string
		
		//add paranthese to complete the math problem
		
		String result=str1+str2+(num1+num2);
		System.out.println(result);
		
		//practice 
		int num4=11;
		int num5=12;
		
		String str11="Hi";
		String str12="Juan";
		
		System.out.println( num4+num5+str11+str12);
		System.out.println(str11+str12+num4+num5);
		System.out.println(str11+str12+(num4+num5));
		
		
		

	}

}

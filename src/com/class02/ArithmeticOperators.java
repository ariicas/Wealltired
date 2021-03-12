package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
	// +,*,/,-,%
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is = 15
		
		System.out.println("sum of number "+ num1 +" and "+ num2 +" is = "+sum);
		System.out.println("Sum of numer 10 and 5 is 15");
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values "+divOfDouble);
		
		float n1=10.99f;
		float n2=90.00f;
		
		float f=n2/n1;
		
		System.out.println("Result of division of 2 float value "+f);
		
		//task 3 
		
		double num01=12.05;
		double num02=09.10;
		
		double sumOfDoubles=num01+num02;
		double subOfDoubles=num01-num02;
		double multOfDoubles=num01*num02;
		double diviOfDoubles=num02/num01;
		
		System.out.println("The sum of 2 number "+num01+" and "+num02+" is equal to "+sumOfDoubles);
		
		double num03=3.9;
		double squareDouble=num03*num03;
		System.out.println("The square of the "+num03+" is "+squareDouble);
		
		int num04=5;
		int num05=8;
		
		int peremiter=num04+num04+num05+num05;
		
		System.out.println("The perimeter of a rectangle width "+num04+ " and height "+num05+" is equal to "+peremiter);
		
		//continue of lesson 
		//precedence * and / then + & -
		
		int result=10+2*5;
		System.out.println(result);
		
		//modulus operator --> shows reminder of the division
		
		int mod=10%3;
		System.out.println(" Remainder is = "+mod);//1
		
		int mod1=10%2;
		System.out.println("Remainder is ="+mod1);//0
		
		int mod2=10%4;
		System.out.println("Remainder is ="+mod2);//2
		
		int r=(20%7)*3;
		System.out.println(r);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
	}

}

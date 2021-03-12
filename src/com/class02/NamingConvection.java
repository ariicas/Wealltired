package com.class02;

public class NamingConvection {

	public static void main(String[] args) {
		//keyword- a special word that reserved in java memory: class, public, static, final for
		
		
		//identifiers- name that we give to classes, variable and methods 
		
		/*
		 * RULE!!
		 * DO NOT USE KEYWORD AS IDENTIFIERS 
		 * Identifiers cannot contain space
		 * Identifiers cannot start with numbers
		 * Identifiers cannot have special characters:_or$
		 * 
		 * 
		 */
		//1. int final;=10; error: INVALID Identifier  
		//2. byte variable one=12;
		
	    //3.short 1b=12;
		
		//4. long *l=20000;
		   // long l*=20000;
		// but we can use long _l=2000;
		               // long long_=29990;
		
		double $price=12.99;
		double  price$= 10.99;
		
		//NamingConvention 
		  // 1. we use camel casing
		  // 2. classes starts with Upper cases and will follow camel casing
		  // 3. variable start with lower case and will follow camel casing
		  // 4. packages we use lower case and use name as reserve or url
		  // 5. meaningful names for your variables
		
		
		int Number=12; //try not to use uppercase for variables names
		int number=12;// more preferable 
		
		int number0ne=12;
		int numberT=12; //lower case variable and second word follow Upper case. 
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.39;
		
		//More practice on my own.\
		double total=mangoPrice+applePrice;
		
		
		System.out.println(" I went to the store and I saw the mangos price is "+mangoPrice+" compared to apples were "+applePrice);
		System.out.println(" If I bought both items, the total is "+total);
		
		
	}

}

package com.class16;

public class Task01 {

	public static void main(String[] args) {
		// create a string that will hold a sentence. Write a program to get a new String 
		// without any spaces. 
		
		String var1="Hey there students";
		System.out.println(var1.replaceAll(" ",""));
		System.out.println("=============Task 2=======================");
		
		//Create a string that should be a combination of letters, numbers and special characters. Find out how manu alpha characters are there
		//in string 
			//alpha = alphabet
			String var2="hitherestdernrd39203&*$%&$$";
			String vartotal=var2.replaceAll("[^a-zA-Z]","");
			System.out.println(vartotal.length());
		
		System.out.println("================Task 3=====================");
		//how would you find out how many sentence are in the below String?
		//length()method. length comes from arrays 
		
			String a ="Is it saturday? Is it raining? do we have a Java Class Today?";
			String[]strArr1=a.split("[?]"); //this is an array 
			System.out.println(strArr1.length);
			System.out.println(a.split("[?]").length); //second way 
	
	}
	
}

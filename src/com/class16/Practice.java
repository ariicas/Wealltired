package com.class16;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a string that you can switch the letter "e" to "a"
		
		String name="Hello There Syntax Students!";
		System.out.println(name.toUpperCase().replaceAll("e","a"));
		
		//Create a string with many alpha and characters/ and deleter anything besides characters and also take how many characters are there. 
		
		String name1="Iwannaworkhardplayhard1234095849&%%&***$#%^&*";
		System.out.println("How many character are in the original string\n"+name1.length());
		String name2= name1.replaceAll("[a-z-A-Z-0-9]","");
		System.out.println("This is the string after replaceAll method was use\n"+name2);
		int name3=name2.length();
		System.out.println("How many characters are there after using replace all method\n "+name3);
		
		//how many sentences are in these string. 
	
		String name4="Hi my name is ariana, Im 27 years old, I was born in Ecuador and I have a 9 year old boy";
		System.out.println(name4.toUpperCase().substring(0,21));
		System.out.println("Number of sentences in this string is "+name4.split("[,]").length);
	}

	
	

}

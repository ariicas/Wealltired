package com.class15;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Azizi"; //mostly used because of shorter syntax
		String name1= new String(" Azizi"); //shorter way to create object 
		
		System.out.println(name);//// executed name "Azizi"
		//Length=> Number of character in a String Object; 
		
		System.out.println(name.length()); //executed number of letter in azizi name
		
		name="            Azizi";
		int len=name.length(); //reasing the value to int len 
		System.out.println(len); //it prints out the number of character of azizi plus the space 
	}

}

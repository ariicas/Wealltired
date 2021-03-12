package com.class11;

public class AllValuesFromEdArray {

	public static void main(String[] args) {
	
		String[][] usa= {
				
		{"Alexandria","Oakton","Arlington", "Virginia Beach", "Fairfax"},
		{"Philly","Strassburg","Pittsburg"},
		{"Boston","Quincy","Springfield","Burlington"},
		{"Los Angeles","Long Beach","San Francisco","Sacramento","Santa Barbara"},
		{"Miami","Orlando","Tampa","Tallahassee"},
		
		};
		System.out.println(usa.length);//
		System.out.println(usa[0].length);
		System.out.println(usa[1].length);
		System.out.println(usa[2].length);
	System.out.println("======================================================================");	
		for (int r=0; r<usa.length; r++) { //iterates over rows
			
			for(int c=0; c<usa[r].length; c++) {
				
				System.out.print(usa[r][c]+ " ");
			}
		
		System.out.println();
		}
		
		System.out.println("=============Using for each loop=Avanced loop Way=====================");
		
		for(String[] cities:usa) {
			
			for(String b:cities) {
				
				System.out.print(b+", ");
			}
			
			System.out.println();	

			
		}
	}

}

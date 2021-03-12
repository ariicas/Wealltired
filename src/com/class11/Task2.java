package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// task 1 
		
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith","Jordan", "Jackson","Obama"},
				
		};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		System.out.println("=====================Task2==============================================");
		///Task2 
		String[][] array1= {{"Ariana","Tim","Bob","Liam"},{"A","B","C","D"}};
		System.out.println(array1[0][1]+" " +array1[1][0]);
		System.out.println(array1[0][0]+" " +array1[1][1]);
		System.out.println(array1[0][2]+" " +array1[1][2]);
		System.out.println(array1[0][3]+" " +array1[1][3]);
	}

}

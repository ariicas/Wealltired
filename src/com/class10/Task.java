package com.class10;

public class Task {

	public static void main(String[] args) {


		char[] grade=new char [6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		
		System.out.println("==============Another way====================================");
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		
		//char[] grades1;
		//grades1={};---> wont work;
		
		System.out.println(grades[6]);
		System.out.println("Number of elements in 2 array "+grades.length);
		
		
		System.out.println("=====================Task 2========================================================");
		String[] names =new String[6];
		names[0]="Lily";
		names[1]="Elizabeth";
		names[2]="Jonathan";
		names[3]="Sammy";
		names[4]="Nelson";
		names[5]="Yovanna";
		
		System.out.println(names[3]);
		
		System.out.println("=====================Task 2= another way=======================================================");
		
		String[] name1={"Lily","Elizabeth","Nelson","Sammy","Jonathan","Yovanna"};
		
		System.out.println(name1[3]);
		
		System.out.println("=====================Task 3=======================================================");
		
		String [] words= {"Java","Saturday","day","coding","is"};
		
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}	

}

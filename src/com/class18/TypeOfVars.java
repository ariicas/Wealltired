package com.class18;

public class TypeOfVars {
	//CLASS REVIEW FROM LAST CLASS ON VARIABLES  
	String name; 
	static String CompanyName="Syntax";
	
	void PrintInfo() {
		System.out.println(name+"Company"+"CompanyName");
		
	}
	static void printCompanyInfo() {
		System.out.println(CompanyName);
			
		}
	//	System.out.println(name); cant put this under a static method.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfVars obj1=new TypeOfVars ();
		obj1.name="Ram";
		
		TypeOfVars obj2=new TypeOfVars ();
		obj2.name="Ram";
		// we cant use a instance variable on a static method .
		
	}

}

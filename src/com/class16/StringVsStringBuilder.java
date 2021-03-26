package com.class16;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //String [] firstNames=new String[35000000];
		//String [] LastName=new String[35000000];
		//review 9:32 for interview questions
		
		String var1="USA"; 
		String var2="USA";
		String var3="USA";
		String var4= new String ("USA");// when new a new object will be created in the heap and some memory cells in the pool area. 
		System.out.println(var1==var2);
		System.out.println(var1==var4);
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var4));// because .equals comparing the actual content of variables not matter how we have declare not compare the address.
		//string have special location to save memories string pool if they have same value it goes to the same variable. 

		
		StringBuilder sb=new StringBuilder("USA"); //mutable. 
	}
		// strings are immutable because we should not be allowing to change the value(string) &&save memory
	 	//because we would have to change all the variable
	 	//to a different variable .//string are immutable; variables are not. 
}

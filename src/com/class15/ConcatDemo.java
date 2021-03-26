package com.class15;

public class ConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Steven";
		String lastName="Marquez";
		System.out.println(firstName+lastName); //used widely
		
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		fullName=firstName.concat(lastName); //not common
		System.out.println(fullName);
		
		String var1="Hello";
		int var2=14;
		System.out.println(var1+var2);
		//system.out.println(var1.concat(var2)); Ce we can only use concat with Strings

	}

}

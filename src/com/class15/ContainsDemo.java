package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="This is a demo of contains #";
		System.out.println(var.contains("#"));
		if(var.contains("#")) {
			System.out.println("# are not allowed");
		}
		
		System.out.println(var.contains("demo"));
		
		System.out.println(var.startsWith("7")); ///if the statement starts with a certain letter 
		
		System.out.println(var.endsWith("#")); // if the satements ends with a certain letter or char 
	}

}

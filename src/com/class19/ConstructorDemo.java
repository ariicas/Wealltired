package com.class19;

public class ConstructorDemo {

	ConstructorDemo(){
		System.out.println("Constructor");
	}
	int returnNumber() {
		return 10;
	}
	
	
	public static void main(String[]args) {
		//we need constructuor to initiliaze and they are called when we created an object. 
		ConstructorDemo obj=new ConstructorDemo();
		int var1=obj.returnNumber();
		
	}
	
}

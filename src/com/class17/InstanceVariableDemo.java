package com.class17;

public class InstanceVariableDemo {
	
	int number=10;//inside class but outside of main method.//instance variable
	
	void printNumber() {
		System.out.println(number);
		String name="Ashgar";
	}
	void printNumber2() {
		System.out.println(number);
		//System.out.println(name); not able 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariableDemo obj=new InstanceVariableDemo();
		System.out.println(obj.number);

	}

}

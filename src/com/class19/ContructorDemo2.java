package com.class19;

public class ContructorDemo2 {
 //blue color means instancce variables 
	double bonus; //this are instance variables 
	double salary;
	String name;
	//we use this.  to access an instance variable. use to identify instance or local bariable
	
	ContructorDemo2(String name){ //contructor;
		bonus=50000;
		salary=50000;
		this.name=name;// this will be a local variable/brown color
	}
	
	public static void main(String[]args) {
	ContructorDemo2 obj= new ContructorDemo2("Ram");
	System.out.println(obj.bonus);
	System.out.println(obj.salary);
	System.out.println(obj.name);
	}
}

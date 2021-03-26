package com.class17;

public class Employee {
// create a class called Employee,create three variables empID, SALARY 
	String empID;
	int salary;
	static String CEO="Sumair";
	
	
	

	public static void main(String[]arg) {
		
		Employee ob1=new Employee();
		ob1.empID="11223";
		ob1.salary=150000;
		System.out.println("Employee ID "+ob1.empID+" There salary is "+ ob1.salary+" CEO "+ob1.CEO);
		System.out.println();
		
		Employee ob2=new Employee(); 
		ob2.empID="3245";
		ob2.salary=34000;
		System.out.println("Employee ID "+ob2.empID+" There salary is "+ ob2.salary+ " CEO "+ob2.CEO);
		
		
		
	}
	
	
}

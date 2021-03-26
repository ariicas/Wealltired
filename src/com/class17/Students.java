package com.class17;

public class Students {
	
	String studentName;  ///instance because is different values 
	String studentID;
	static int numberOfStudents;
	
	
	
	
	public static void main(String[]args) {
	
		Students st1=new Students ();
		
		st1.studentName="Jake";
		st1.studentID="12345";
		st1.numberOfStudents++;
		System.out.println(st1.studentID+"name "+st1.studentName+"Number of Students "+Students.numberOfStudents);
		
		Students st2=new Students();
		st2.studentName="Chris";
		st2.studentID="123245";
		st2.numberOfStudents++;
		System.out.println(st2.studentID+"name "+st2.studentName+"Number of Students "+Students.numberOfStudents);
		System.out.println(st2.numberOfStudents);
		System.out.println(Students.numberOfStudents);
		
		System.out.println("==========how to reverse an intenger============================");
		int salary=100010;
		StringBuilder sb=new StringBuilder(String.valueOf(salary)); //number to string 
		sb.reverse();
		salary=Integer.parseInt(sb.toString());  //   is from string to iNT. 
		System.out.println(salary);
		
		System.out.println("==================how to reverse and double =================================");
		
		double salary1=1000.002;
		   StringBuilder var=new StringBuilder(String.valueOf(salary1));
		    System.out.println(var.reverse());
		  
		System.out.println("=======other way of reverse double========================");
		    
		    double salary2=123456;
			StringBuilder sb1=new StringBuilder(String.valueOf(salary2));
			sb1.reverse();
			
			salary2=Double.parseDouble(sb1.toString());
			System.out.println(salary2);   
			
			System.out.println("=======other way of reverse double========================");
			double salary3=100000.003;
			
			StringBuilder sb3=new StringBuilder(String.valueOf(salary3));
					
					sb3.reverse();
					
			salary3=Double.parseDouble(sb3.toString());
			System.out.println(salary3);
			
	}
	

}

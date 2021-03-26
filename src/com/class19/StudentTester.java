package com.class19;

public class StudentTester {

	public static void main(String[] args) {
		

		Students studentNum1=new Students("Ariana",90,95,89);
		System.out.println(studentNum1.name+" has a grade average of "+studentNum1.averageGrade());
		
		Students studentNum2=new Students("Mathew",74,85,50);
		System.out.println(studentNum2.name+" has a grade average of "+studentNum2.averageGrade());
		
		Students studentNum3= new Students("Jessica",74,72,100);
		System.out.println(studentNum3.name+" has a grade average of "+studentNum3.averageGrade());
		
		Students studentNum4= new Students("Jake",87,75,95);
		System.out.println(studentNum4.name+" has a grade average of "+	studentNum4.averageGrade());
		
		Students studentNum5= new Students("Liam", 67,100,86);
		System.out.println(studentNum5.name+" has a grade average of "+studentNum5.averageGrade());
		
		
		
	}

}

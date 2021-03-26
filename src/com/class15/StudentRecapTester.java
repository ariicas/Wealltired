package com.class15;

public class StudentRecapTester {

	public static void main(String[] args) {
	
		StudentRecap ram =new StudentRecap();
		
		ram.name= " Ram";
		ram.age=25;
		ram.studentID="cs123";
		ram.schoolname=("Syntax");
		ram.study();
		ram.payTuition();
		
		StudentRecap aimenObj=new StudentRecap();
		aimenObj.name="Aime";
		aimenObj.age=26;
		aimenObj.studentID="Cs456";
		aimenObj.schoolname="Syntax";
		aimenObj.study();
		aimenObj.payTuition();
		
	}

}

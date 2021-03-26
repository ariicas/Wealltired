package com.class15;

public class StudentRecap {
	String name;
	int age;
	String studentID;
	String schoolname;
	
	
	void study() {
	System.out.println(name+" studies in "+schoolname);
	}
	void payTuition() {
		System.out.println(name+" pays the the tuition ");
	}
	
	int getStudentAge() {
		return age;
	}

}

package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		
		boolean classToday=true;
		
		//is it morning?-->good morning
		//	if there is class:yes-->hello classmates
		//			otherwise--->hello my family
		
		
		
		if (morning) {
			System.out.println("Let me check if I have class today ");
			
			if(classToday) {
				System.out.println("Good Morning my classmates");
			}else {
				System.out.println("Good Morning my family");
			}
		}
		System.out.println("-------------------------------------------");
		
		
		
		
		
		
		boolean anyAllergy=true;
		boolean pollenAllergy=true;
		
		if (anyAllergy) {
			System.out.println("Lets check which allergies you have ");
			if (pollenAllergy) {
				System.out.println("Do not get close to trees ");
			}else {
				System.out.println("Ok I know you do not have a pollen allergy");
			}
		      }else {
				
				System.out.println("You are lucky you do not have any allergies");
		      }
			}
	}


			
			
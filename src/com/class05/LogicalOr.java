package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day 
		 * 
		 * if day is Tuesday or Wednesday -->manual Class 
		 * if day monday or friday -->no class
		 * if day is staruda or sunday --Java class
		 * if day is thrusday --> review class
		 */
		
		String day="fgkkf";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have no class");
		}else if (day.equals("Tueday") || day.equals("Wednesday")) {
			
		}else if (day.equals("Thursday")) {
			System.out.println("Today I have review class");
			
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
				System.out.println("Today I have Java Class");
	} else {
		System.out.println(day+" in invalid");
	}
	}
}

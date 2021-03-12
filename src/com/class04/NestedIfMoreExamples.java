package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
	
		/*
		 * if it is friday --->go to the movie, otherwise stay at home and study
		 * if it is friday
		 * 
		 * 
		 */
		
		boolean isFriday=true;
		int day=13;
		
		if (isFriday) {
			System.out.println("Its a movie day!!");
			if(day==13){
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I watch any available movie");
			}
				
			}else {
			System.out.println("I will stay at home and study Java ");
		}
		System.out.println("-------------------------------------------");
		
		/*
		 * check assignment and based on the score we display a message
		 */
		
		
		
		
		
		
		
		boolean completed=true;
		int score=88;
		
		if(completed) {
			
			if (score>90) {
				System.out.println("Great Job");
			}else if (score>80) {
				System.out.println("Good Job");
			}else if (score>70) {
				System.out.println("Good, but lets try to do better");
			}else {
				System.out.println("Good for trying, but study more!!");
			}
			
		}else {
			System.out.println("Please make sure to complete all assignments on time");
		}
	}

}

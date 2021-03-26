package com.class14;

public class MorePractice {

	
		void haircut(String girl) {
			if(girl.equals("Karina")) {
				System.out.println("She needs a haircut");
			}else {
				System.out.println("She needs to dye her hair");
			}
			
			
		}
		void onePractice(int num) {
		String weekday;
		switch(num) {
		
		case 1:
			weekday="Monday";
			break;
		case 2:
			weekday="Tuesday";
		case 3:
			weekday="Wednesday";
			break;
		case 4:
			weekday="Thursdya";
			break;
		case 5:
			weekday="Friday";
			default:
				weekday="Is the weekend";
				break;
				}
		System.out.println(weekday);
		
		
		}
	
		String  isFood(boolean hot ) {
			if(hot) {
				return "\nI'll go to the beach";
			}else {
				return "\nI will stay inside ";
						
			}
				
		}
		
		int whatIs(int a, int b, int c) {
			if(a>b) {
				return a;
			}else if (b>c) {
				return b; 
					
				}else {
					return c;
				}
		}	
		
		void favFood(String dishes) {
			 
			if(dishes.equals("pizza")) {
				System.out.println("What is your favorize topping?");
				}else if(dishes.equals("Ice Cream")) {
					 System.out.println("What is your favorite flavor?");
				 }else {
					 System.out.println("You are a picky eater");
				 }
		
	
	}
		String money (double c) {
			if(c==10) {
				return "I'm not going to buy it";
			}else if (c<=10) {
				return "I MUST buy it!";
			}else {
				return "Get a job!";
			}
		}
		
}
package com.class04;

public class Hw04IfElse {

	public static void main(String[] args) {
		
		///Exercise 1 only if/else no scanner 
		//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less or equal to 200,000 then you would lend the money 
		//otherwise you would reject the client.
		
			int loan=10000;
			if (loan<=200000) {
			System.out.println("We can lend you the loan");
		}else {
			System.out.println("We can not lend you the loan");
		}
			System.out.println("--------------------------------------------------------------------");
	   //Exercise 2 only if/else no scanner 
			//You are DMV representative and you need to ask customer their age. 
			//If they are 18 and older you will issue a driver license to them, 
			//otherwise you will offer them to get a learners permit.
			
			int age=17;
			if (age>18){
				System.out.println("You can get your driver license");
			}else {
				System.out.println("You will need to get your learners permit first");
			}
	}

}

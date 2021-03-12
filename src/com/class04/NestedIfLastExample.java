package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {

		/*
		 * to donate:
		 * you must be 18 and older;otherwise you cannot
		 * your weight must be more than 110lb,otherwise you cannot donate 
		 */
		
		int age=17;
		int weight=109;
		
		if (age>18) {
			if(weight>110) {
				System.out.println("You qualify to donate based on age and weight");
			}else {
				System.out.println("Your weight is too small, you can not donate");
			}
		}else {
			System.out.println("You age is not egible");
		}
	}

}

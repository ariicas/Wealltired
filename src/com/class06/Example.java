package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * we need to calculate final prince after the discount
		 * 
		 * we check if there is sale 
		 * if not sale-->I am not going for shopping
		 * if there is a sale 
		 * 		we will ask the item
		 * 		we will ask price 
		 * 		
		 * 		if price is less than 10--> apply 5 discount 
		 * 		if price is between 10 and 100---> apply 10 discount
		 * 		if price is between 100 to 500---> apply to 20 discount 
		 * 		if price is more than 500 -->apply 30%
		 * 
		 * "which item your purchase, what was original price, what discount has applied and what is the 
		 * final price"
		 */
		
		
		double discount = 0, price, finalPrice = 0;
		String item;
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a sale?");
		Boolean sale = scan.nextBoolean();

		if (!sale) {
			System.out.println("I am not going shopping");
		} else {
			System.out.println("What item would you like to puschase");
			item = scan.next();
			System.out.println("What is the price for the item");
			price = scan.nextDouble();

			if (price < 10) {
				discount = price * 0.5;
				
			} else if (price >= 10 && price < 100) {
				discount = price * 0.1;
				
			} else if (price >= 100 && price <= 500) {
				discount = price * 0.2;
				
			} else if (price > 500) {
				discount = price * 0.3; /// ---- only here do (; sign)
				
			}
			
			finalPrice=price-discount;
			System.out.println("You are buying " + item + " with original price= " + price + " after discount "
					+ discount + " your final price is = " + finalPrice);// syso always has to be inside the if method/if not it will complain
			if(finalPrice<500) {
				System.out.println("I did not do crazy shopping");
			}

	    }
	}
}

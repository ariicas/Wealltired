package com.class11;

public class Task04 {

	public static void main(String[] args) {
		String [] [] veggies= {
				
				{"Cabbage, Tomatoes, Potaoes, celery"},
				{"Apple, Bannanas, Peach, Mango, Strawberries"},
				{"Yougrt, Milk, Eggs"},
		};
		for(String[] array:veggies) {
			
			for(String b:array) {
				
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
	for (int a=0; a<veggies.length; a++) {
			
			for(int b=0; b<veggies[a].length; b++) {
				
				System.out.print(veggies[a][b]+" ");
	}
			System.out.println();
	}
	}
}

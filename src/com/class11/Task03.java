package com.class11;

public class Task03 {

	public static void main(String[] args) {
		
		System.out.println("========TASK CARS==================");
		String [] [] cars= {
			
				{"Ford","Jeep","Cadillac","Dodge"},
				{"Audi","BMW","Porsche"},
				{"Kia","Hyundai","Samsung"},
				{"Ferrari","Flat","Alfa Romeo"},
		
		
		};
		for(String[] array:cars) {
			for(String b:array) {
				
				System.out.print(b+" ");
			}
			System.out.println();
		
		}
		System.out.println("================2nd loop=============");
		
	for (int a=0; a<cars.length; a++) {
			
			for(int b=0; b<cars[a].length; b++) {
				
				System.out.print(cars[a][b]+" ");
			}
			System.out.println();
	}
	}
}

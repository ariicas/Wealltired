package reviewclass05;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		// 
		
		System.out.println("How many numbers you want add");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		double [] numbers =new double[size];
		for (int i=0; i<size; i++) {
			System.out.println("Enter your number");
			numbers[i]=scanner.nextDouble();
		}
		double sum=0; 
		for(double number: numbers) {
			sum+=number;
			
		}
		System.out.println("Sume of the number is " + sum);
	}

}

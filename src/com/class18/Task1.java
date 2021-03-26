package com.class18;

public class Task1 {
/*
 * Create a method that will accept an array as parameters and will return a 
 * sum of all elements from that array. Method should be visibly only 
 * within same package and accessible by the creating an instance of the class. 
 */
//private only within the same class 
	//default if not name in the method in can be access within the same package. 
	
	public double sumArrayElements(double[]arr) {
	// this example goes with DemoFromOther packer from pack 17	
		double sum=0;
		for (double element:arr) {
			sum+=element;
		}
		return sum;
		
	}
}

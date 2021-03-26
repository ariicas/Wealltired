package com.class17;

import com.class18.Task1;

public class DemoFromOtherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Task1 obj2=new Task1();
		double []arr= {10,20};
		obj2.sumArrayElements(arr); // this is from package 18 is able to 
		//transfer and used in this package because method on class 18 it was public 
		
		System.out.println(obj2.sumArrayElements(arr));
		

	}

}

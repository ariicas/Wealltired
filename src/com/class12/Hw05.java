package com.class12;

public class Hw05 {

	public static void main(String[] args) {
		// write a program that swap 2 numbers without a temporary variable:
		
		int x=10;
		int y=5;
		
		x=x+y; //15// add the first two variables x+y and the result is the new x
		y=x-y;//10 // then  do the new x which is 15- y which is 5 and now its the new Y = 10
		x=x-y; //15-10=5// then do the value of X which is 15 minus the new Y values which is 10 
				// the result is 5. so now x=5; and y =10l
		
		System.out.println("After Swaping:x = "+x+",y="+y);
	

	{
	int a=12;
	int b=2;
	
	a=a+b;  //a=12  12+2= 14
	b=a-b;  //14-2=12
	a=a-b;  // 14-12=2'
	
	System.out.println("After swabing"+a+"oh"+b);
	}	
	
}	


}

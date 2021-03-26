package com.class17;

public class ClassNotes17 {
	
	/*
	 * String is class in java that helps us manipulate combination of letter likke ("iriwrjowjowjro'");
	 * there are many useful methods to manipualte these combination of letters.
	 * for examples 
	 * isEmpty
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Internal memory implementation fo the String class.
	 * String are immutable which means once a String object is created inside the computer memoery we can not change the value
	 * of that object if we try to change the value of String object a new object will be created and changes will be made to that new object.
	 * but if we use the StringBuilder class no object for the duplicate value will scanned from the momey and always a new object
	 * will be created inside the memory.
	 * When we should we use String and StringBuilder
	 * if we know that most of our variables will contain same values and memory utilization is important then we should use String Class it saves 
	 * alot of memory but can be slow because everytime we create a variable all of the existing String Objects will be scanned. 
	 * (no speed/save memories/and not data is changing  =String Class)
	 * (speed is important/ no save memories and our object contain different values =String Builder)
	 *///========================================================================================================================.

	       /*Types of Variable w.r.t their scope 
	        * In there are three types of variables in Java 
	        * 1.local variables 
	        * 2.instance variables 
	        * 3.static variables. 
	        *///method behaviors, perform action
	/* Local Variable
	 * are the variables which are declared inside a method, constructor or any block of code like if condition, while loop, for loop
	 * do while loop and switch statement or anything inside the class that has a {" and and ending"} or inside the parenthesis like 
	 * "(
	 * for examples 
	 * void print (){
	 * String name="Blah Blah";-->local variables 
	 */
	/*Instance Variables;
	 * are the variables which are declared inside a class but outside of a method, cosntructuo or any block of 
	 * code like if condition, while loop, for loop and any other thing inside. 
	 * a class that has a "{and and ending "}" or inside the parenthese like "(" and ")"
	 * instance variables can be accessed anywhere inside a class by directing calling them using their names 
	 * but we can not access them inside a static method(will explained later) by directy calling their names but we can access them by 
	 * creating an object for that class/
	 * 
	 */
	/*static variables
	 * any instance variable declared with a static keyword is called static variable;
	 */
	
	/*When to use local variables?? 
	 * always use local variables if it is possible
	 */
	 /*When to use Instance Variables?? 
	  * it will stay in memory as long as they object is in use. 
	  * 
	  */
}

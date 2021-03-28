package repls;

public class REPL124 {

	/*Declare static variable in class level as below and assign its value:

		String ss="Welcome To Syntax Technologies"

		Access variable in the main method and print it using three ways you learned so far

		Hint:

		first way: By calling directly

		Second way: By using the className

		Third way: By creating the object of the class */
	
	
	static String ss="Welcome To Syntax Technologies";


	  public static  void main (String []args) {

	    System.out.println(ss); //calling directly 

	  System.out.println(REPL124.ss);  //calling by using classname 

	  REPL124 obj1= new REPL124(); 

	  System.out.println(obj1.ss); //caling by object.






	  } 
	
}

package repls;

public class repl125 {
/*
		 * For you to do:

Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.

Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance
DOUBLE CHECK THIS 
		 */
		
		 


	  static int num1;

	  public static void main(String []args) {
	    num1=200;
	    repl125 obj1=new repl125();
	    obj1.num1=200;

	    System.out.println(num1);
	    System.out.println(obj1.num1);




	  }
}

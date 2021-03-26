package reviewclass05;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
	   Account yuliasAccount =new Account(); 
	   yuliasAccount.signUp();
	   boolean isSuccessful=yuliasAccount.signIn();
	   if(isSuccessful) {
		   System.out.println("Enter the amount that you want to transfer");
		   Scanner scanner=new Scanner(System.in);
		   yuliasAccount.withDraw(scanner.nextDouble());
		   System.out.println("Please enter recepient routing number");
		   Scanner scanner1=new Scanner(System.in);
			yuliasAccount.transfer(scanner.nextInt());
		 
		  
		  /*
		   * 
		   * add transfer behavior 
		   */
	   }

	}

}

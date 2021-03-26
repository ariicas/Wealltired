package reviewclass05;

import java.util.Scanner;

public class Account {
	
	String userName;
	String password;
	double balance;
	double transferAmount;
	int routing_Number;
	
	void signUp() {
		System.out.println("Welcome to Bank of America");
		System.out.println("Chose your userName");
		Scanner scanner=new Scanner(System.in);
		userName=scanner.next();
		System.out.println("Please choose a password");
		password=scanner.next();
		System.out.println("How much money do you want to deposit?");
		balance=scanner.nextDouble();
	}
	
	boolean signIn() {
		System.out.println("Please enter your userName");
		Scanner scanner=new Scanner(System.in);
		String enteredUsername=scanner.next();
		System.out.println("Please enter your password");
		String enteredPassword=scanner.next();
		if(enteredUsername.equals(userName)&& enteredPassword.equals(password)) {
			System.out.println("Welcome to the Bank of America");
				return true;
		}else {
			System.out.println("Either username or password is not correct");
			return false;
		}
				
		
	}
	
	void withDraw(double amountToWithDraw) {
		if(amountToWithDraw>balance) {
			System.out.println("Not enough balace ");
		}else {
			balance=balance-amountToWithDraw;
			System.out.println("Operation succesful");
		}
	
		}
		void transfer (int routingNumber ) {
		if (routingNumber==routingNumber) {
			System.out.println("This amount of  money will transfer instantly");
			
		}else {
			System.out.println("Unable to complete the transfer");
		}
	}
	
}

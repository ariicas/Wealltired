package reviewclass2;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		String userName;
		String password;
		System.out.println("Please Enter your Username");
		Scanner scaner=new Scanner(System.in);
		userName=scaner.next();
		System.out.println("Please Enter your password");
		password=scaner.next();
		
		
		double accountBalance=1000;
		double amountToTransfer=200;
		
		if(userName.equals("salma")) {
			if(password.equals("salma123")) {
				System.out.println("Welcome to bank of America");
				System.out.println("Please Enter the amount of transfer");
				amountToTransfer=scaner.nextDouble();
				if (accountBalance>=amountToTransfer) {
					System.out.println("Amount Transfered");
				}else {
					System.out.println("insufficientbalance");
				}
			}else {
				System.out.println("Incorrect password");
			}
	}else {
		System.out.println("your username is not correct please try again later");
	}

		
		
	}

}

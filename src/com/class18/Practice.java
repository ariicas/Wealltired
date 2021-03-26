package com.class18;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String var="greg";
		
		StringBuilder a= new StringBuilder (var);
		var=a.toString();
		System.out.println(var);
		
		System.out.println("==================Rversing a stringbuilder ================================================");
		StringBuilder b=new StringBuilder ("ariana");
		System.out.println(b.reverse());
		
		System.out.println("========================================================================================");
		
		String A="Dominque";
		
		for(int i=A.length()-1; i>=0; i--) {
			System.out.print(A.charAt(i));
			
		System.out.println("==========================================================================================");	
		Scanner scan=new Scanner (System.in);
		String pass="Lock";
		
		System.out.println("Please enter password");
		String answer=scan.nextLine();
		while(pass.equals(answer)) {
			System.out.println("you won");
			i++;
			break;
			
		}
			
		}
		
		
			


	}

}

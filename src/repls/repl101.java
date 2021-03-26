package repls;

import java.util.Scanner;

public class repl101 {

	public static void main(String[] args) {
		//Write a for loop that will print out every other letter in a String, starting with the first letter. 
		//These letters should be printed all on one line with no space in between.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word please");
		String word=input.nextLine();
		
		for(int i=0; i<word.length(); i+=2) {
			String output=word.replaceAll("\\s","");
			System.out.print(output.charAt(i));
		}
		
	}

}

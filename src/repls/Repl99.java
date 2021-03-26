package repls;

import java.util.Scanner;

public class Repl99 {

	public static void main(String[] args) {
	/*
	 * Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**

Examples of palindromes:

- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star

Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.
	 */

		
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter the word?");
		String word=scanner.nextLine();
		
		String b="";
		
		int length=word.length();
		
		
		for(int i=word.length()-1; i>=0; i--) {
			b+=word.charAt(i); // we added a string to compare the old"word" to "b";
		}
		if(word.equals(b)) {
			System.out.println("This word is a Palindrome");
		}else {
			System.out.println("False, this word is not a palindrome");
			
			
		}
		
		System.out.println("====================================================");
				String a="water";
				for(int i=a.length()-1; i>=0; i--) {
				System.out.print(a.charAt(i));
			
	}
	
	
		
	
	}
}

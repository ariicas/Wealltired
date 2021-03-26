package com.class15;

public class ChartAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Roheen";
		System.out.println(name.charAt(1)); // this is array in short 
		int sum=0;
		for (int i=0; i<name.length();i++) {

			if(name.charAt(i)==('e')); {/// char metthos was used to go through the loop and get how many e are in the word//.
				sum++; //add this to get the actual number of letter for example 1,3,4
				
				
			}
			
		}
		System.out.println(sum+" is E");
	}

}

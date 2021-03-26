package com.class17;

public class ConvertingBetweenSBandString {

	public static void main(String[] args) {
		String var1="Nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString();//it converts a string to a stringbuilder.
		System.out.println(var1);
		
		
		
		
	}

}

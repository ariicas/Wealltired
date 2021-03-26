package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//^ is the same as !
		
		String var1="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]",""));
		var1="974739fhnvjdAGSHAHnknvkld";
		System.out.println(var1.replaceAll("[a-zA-Z]",""));//to delete the lowercase/uppercase.
		var1="95472382yfgfvcy989DUGDUIH#^&^*";
		System.out.println(var1.replaceAll("[A-Za-z0-9]",""));//how to delete everything but special characters //a-z delete all alphabet
		var1="eijldgjldjgo30-49503-2";
		System.out.println(var1.replaceAll("[^a-z-0-9]", ""));

	}

}

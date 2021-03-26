package com.class17;

public class StgringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1="Meriem";
		String Var2="Aziz";
		String var3="Afzal";
		String var4="Mj";//recommended 
		String var=new String("Angelo");// not recommedned two objects will be created one is heap and other in string pool.
		var4="Ram";
		
	
		StringBuilder sb1=new StringBuilder(var1);  //stringbuilder is faster 
		StringBuilder sb2=new StringBuilder(Var2);
		StringBuilder sb3=new StringBuilder("Afzal");
		StringBuilder sb4=new StringBuilder("MJ");
		
		System.out.println(sb1.reverse());
		//convert string which was var1 to stringBuilder 
		var1=sb1.toString();
		System.out.println(var1);
		
	}

}

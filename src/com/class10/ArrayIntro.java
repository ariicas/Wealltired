package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		num=20;
		System.out.println(num);
		
		int[] array=new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[0]+array[4]);
		
		double[]numbers=new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		numbers[0]=11.99;
		System.out.println(numbers[0]);
		
		//Arrays are fixed in sizes // if you say u need three [3] you have to initiliza all 3 and if u have less it will ne NULL. 
		
		String[] name=new String[3];
		name[0]="Jakamzen";
		name[1]="Ozoda";
		name[2]="Alec";
//		name[3]="Yulia";
		
		System.out.println(name[2]);//alec
		
		int[] nums=new int[3];///preferrable way
		System.out.println(nums[1]);//if no values stored complier add default value to array.0
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("Size of my array "+size);
	}	
	

}

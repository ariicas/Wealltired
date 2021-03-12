package com.class11;

public class ExampleRecap {

	public static void main(String[] args) {
		

		int a,b,c;

		a=10;
		b=12;
		c=14;

		int[] array;
		array=new int[3];
		array[0]=10;
		array[1]=12;
		array[2]=14;

		int[] nums={10, 12, 14, 44, 23, 78};
		int total=nums.length;

		int forthElement=nums[3];

		for(int i=0; i<nums.length; i++){
			
			System.out.print(nums[i]);
		}
		System.out.println();
		for (int i=nums.length-1; i>=0; i--){
			System.out.print(nums[i]);
		}

		System.out.println();
	}

}

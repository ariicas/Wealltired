package com.class09;

public class ClockExample {

	public static void main(String[] args) {
		
		for (int h=0; h<24; h++) {
			
			for(int m=0; m<60; m++) {
				
//				if (h<10 && m<10) {
//					System.out.println("0"+h+":0"+m);
//				}else if (h<10 && m>=10) {
//					System.out.println("0"+ h + ":" +m);
//				}else if (h>10 && m<10) {
//					System.out.println(h+ ":0" +m);
//				}else {
//					System.out.println(h+":"+m);
//				}
				
			
					
				
				
			}
		}
//		for (int hour = 0; hour < 24; hour++) {
//			for (int min = 0; min < 60; min++) {
//				if (hour < 10) {
//					System.out.print("0");
//				}
//				System.out.print(hour + ":");
//				if (min < 10) {
//					System.out.print("0");
//				}
//			System.out.println(min);
//			}
//			}
	
		System.out.println("=====================clock============================");
		
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				
				if (h<10) {
					
					if (m<10) {
						System.out.println("0"+h+ ":0" +m);
					}else {
						System.out.println("0" +h+ ":"+m);
					}
				}else {
					if (m<10) {
						System.out.println(h + ":0" +m);
					}else {
						System.out.println(h+":"+m);
					}
					}
				}
	
		}
		
		System.out.println("-----------------Multiplication----------------------------------------------------------");
		
		int result;
		
		for(int i=1; i<=10; i++){ 
		    for(int j=1; j<=10; j++){
		      result= i*j;
		      System.out.println(i + "x" + j + "="+ result);
		    	
		            }
		            
		}
	}

}

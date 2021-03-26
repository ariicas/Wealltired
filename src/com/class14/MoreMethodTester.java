package com.class14;

public class MoreMethodTester {

	public static void main(String[] args) {
		
MoreMethodExamples moreMethodExamples=new MoreMethodExamples();

System.out.println(moreMethodExamples.print());
System.out.println(moreMethodExamples.doubleTheValue(60));
moreMethodExamples.isRaining(false);
moreMethodExamples.print5(); //void only printing 
System.out.println(moreMethodExamples.returnGreater( 122,56));
moreMethodExamples.numEvenOdd(31);

double [] arr= {10.2,25,30};
System.out.println(moreMethodExamples.returnTheArraySum(arr));

System.out.println(moreMethodExamples.isMirror("aba"));
System.out.println(moreMethodExamples.isMirror("adcdef"));
	}

}

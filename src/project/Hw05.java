package project;

public class Hw05 {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable?
		int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + y);
        
//       *// STEP 1: START.
//        STEP 2: ENTER x, y.
//        STEP 3: PRINT x, y.
//        STEP 4: x = x + y.
//        STEP 5: y= x - y.
//        STEP 6: x =x - y.
//        STEP 7: PRINT x, y.'
     //   STEP 8: END.
        
        int[] numbers= {10, 14, 78, 5, 90, 76};
		
		numbers[2]=numbers[2]+numbers[3];
		numbers[3]=numbers[2]-numbers[3];
		numbers[2]=numbers[2]-numbers[3];
		
		System.out.println(numbers[2]+" "+numbers[3]);
        
	}

}

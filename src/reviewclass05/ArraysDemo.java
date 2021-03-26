package reviewclass05;

public class ArraysDemo {

	public static void main(String[]args) {
		//why we use variables? to hold single values 
		//there are 8 primitive types byte, short,float ,int, double, long, boolean 
		/*what are limitation of variables? 
		 * variable can only hold a single value at a time. 
		 * 
		 */
		/*limitation of variable is that we can only store a single value at a time 
		 * if we ttry to store a new value previous value is overridden by the latest value to overcome 
		 * this issues havas has ARRAYS. in arrays we can store multiple valyes using a single array type.
		 */
		
		//one D arrays 
		String [] names= new String [10]; // recommanded approach
		//String name2[]=new String [10];
		names[0]="Alina";
		names[1]="Monika";
		names[2]="Azizi";
		//2D Arrays declaration
		int [][] numbers =new int [10] [10];
		numbers[0][0]=12;
		numbers[0][1]=20;
		
		for (int i=0; i< numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}
		
		
		
		
		
		
	}
}

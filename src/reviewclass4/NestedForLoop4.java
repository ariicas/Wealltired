package reviewclass4;

public class NestedForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=0; i<5; i=i+2) {
				
				System.out.println("i");
				
				//whebn we will be entering the loop these two statements will be executed int j=0; i<5;
				// after that all the code inside the loop will ne executed and then j=j-i and the condition will be executed
				//checked 1<5; after that 
				//j=j-1;
				// i<5;
				//j=j-i;
				//1<5
				
				for (int j=0; i<5; j=j=-i) {
					System.out.println(i+" "+j);
				}
				System.out.println("i");
			}
	}

}

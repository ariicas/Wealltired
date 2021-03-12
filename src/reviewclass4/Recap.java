package reviewclass4;

public class Recap {

	public static void main(String[] args) {
	
		
		int i=10;
		System.out.println("int i=10; \n"+i);
		i=i+20; //10
		System.out.println("int i=10; \n"+i);
		i=i+10; //30
		System.out.println("int i=10; \n"+i);
		i++;//40
		System.out.println("int i=10; \n"+i);
		++i;//41
		
		System.out.println("int i=10; \n"+i);
		//42
		
		i=10;
		System.out.println("int i=10; \t"+(++i));
		System.out.println("int i=10; \t"+(i++));
		
		System.out.println("int i=10; \t"+(++i+(++i)));
		System.out.println("int i=10; \t"+(i++));
	}

}

package reviewclass05;

public class MethodsDemo {
	/*
	 * Return Types 
	 * void if method does not return any tupe we use void 
	 */
	
	void simpleMethod() {
		System.out.println("How are you?");
	}
	
	int simpleIntMethod() {return 10;}
	
	void onlyTakesInput(int x) {
		System.out.println(x);
	}
	
	void methodWithTwoInputs(String name, double salary) {
		System.out.println(name+"earns "+salary);
	}
	int sum(int num1, int num2) {
		return num1+num2; //widely used 
	}
	
	boolean isNumberPositive(int number) {
		if(number>0)  {// return number >0
			return true; 
				
			}else {
				return false;
			}
	}
}

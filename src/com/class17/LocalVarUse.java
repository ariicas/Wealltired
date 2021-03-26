package com.class17;

public class LocalVarUse {
	double salary=120000;
	
	void printInfo() {
		String name="Asgahr";
	}
	void printSalaryPlusBonus() {
		double bonus=50000;
		System.out.println(salary+bonus);
	}
	
	public static void main(String[] args) {
		
		
		LocalVarUse obj=new LocalVarUse();
		obj.printInfo();
		obj.printSalaryPlusBonus();

	}

}

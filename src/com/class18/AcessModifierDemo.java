package com.class18;

public class AcessModifierDemo {
public String name; //properties 
private String BankAccountPassword;
String SSNNumber;


public void accessToPark() {
	System.out.println("Everyone can go to public car");
	
}

void car() {
	System.out.println("My little broth can have my car, please dont destroy it.");
}

private void toothbrush() {
	System.out.println("No one should use it");
}

void printInfo() {
System.out.println(name);	
System.out.println(BankAccountPassword);	
System.out.println(SSNNumber);	
}

}

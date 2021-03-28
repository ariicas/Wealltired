package com.class22;

public class SuperandStatic {
String color;

static void printInf() {
   // super.color="gjdrg";
}
public static void main(String[]args) {
    SuperandStatic superAndStatic =new SuperandStatic();
    superAndStatic.color="Red";
    SuperandStatic superAndStatic1= new SuperandStatic();
    superAndStatic.color="yello";
    // it ewill create confusion/error.

}
}
class parent {
    String color;
}

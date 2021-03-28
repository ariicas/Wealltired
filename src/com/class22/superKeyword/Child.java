package com.class22.superKeyword;

public class Child extends Parent{
    String color = "Red";

    void printColor() {
        System.out.println("Child class" + this.color);
        System.out.println("Child class" + super.color);
    }

    void Print(boolean shouldCallParents) {
        if (shouldCallParents) {
          super.printColor();
        }else {
           this.printColor();
        }
    }
}
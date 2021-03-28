package com.class22.superKeywordDemo2;

public class Dogclass extends Animal {
    String breed;


    Dogclass() {
        System.out.println("Child");
    }

    Dogclass(String name, int age, String color) {
        super(name, age, color);
        this.breed=breed;
    }

    void printInfo(){
        System.out.println(name+" age "+ age+ "breed "+ breed);
    }
}

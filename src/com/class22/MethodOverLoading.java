package com.class22;

public class MethodOverLoading {
    void add(int a, int b) {
        System.out.println(a+b);

    }
    void addDoubles(double a, double b){
        System.out.println(a+b);
    }
    void addArrays (int []arr){
        int sum=0;
        for (int num:arr) {
            sum+=sum;
        }
        System.out.println(sum);
    }

    void addThreeNumber(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String []args) {
    MethodOverLoading methodOverLoading= new MethodOverLoading();
        methodOverLoading.add(10,20);

        methodOverLoading.addDoubles(10.5,20.5);
        int []arr ={10,10,10};
        methodOverLoading.addDoubles(10.5,20);
    }
}

package com.bl.inheritance;

public class Parents {
    int a = 10;
    int b = 20;

}
class Derived extends Parents{
    int a = 100;
    int b = 200;
    void add(int i , int j){
        System.out.println(i + j);
        System.out.println(this.a+this.b);
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        new Derived().add(1000,2000);
    }
}

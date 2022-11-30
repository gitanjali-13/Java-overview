//Method overloading sample program.
package com.bl.poly;

public class MethodOverloading {
     void add(int a, int b){
        int c = a+ b;
         System.out.println(c);
    }
    void add (int a , int b, int c){
         int sum = a+ b+ c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodOverloading mt = new MethodOverloading();
        mt.add(2,5);
        mt.add(4,2,6);

    }
}
//Constructor overloading

//public class MethodOverloading {
//    MethodOverloading(int a) {
//
//        System.out.println("1- args constructor" + a);
//    }
//
//    MethodOverloading(int a, int b) {
//        int c = a + b;
//        System.out.println("2-args constructor overloading" + c);
//    }
//
//    MethodOverloading(int a, int b, int c) {
//        int sum = a + b + c;
//        System.out.println("3-args constructor overload");
//    }
//
//    public static void main(String[] args) {
//        new MethodOverloading(2);
//        new MethodOverloading(2, 2);
//        new MethodOverloading(2, 3, 4);
//    }
//}
//Operator Overloading
//public class MethodOverloading {
//    public static void main(String[] args) {
//        System.out.println(10 + 20);
//        System.out.println(10 + "computer");
//        System.out.println(10 + "computer" + "Programming" + 10 + 20);
//    }
//}
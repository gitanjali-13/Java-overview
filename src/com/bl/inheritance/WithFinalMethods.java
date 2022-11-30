package com.bl.inheritance;

final class WithFinalMethods {
    int a = 10;  //final class variables are not final.
    void method(){   //final class method is default final.
        System.out.println(a);
    }

    public static void main(String[] args) {
        new WithFinalMethods().method();
    }
}

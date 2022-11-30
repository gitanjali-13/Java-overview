package com.bl.day1;

public class Main2 {
    void m1() {
        System.out.println("m1 method");
    }
    static void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        Main2 m = new Main2();
        m.m1();
        Main2.m2();
    }
}

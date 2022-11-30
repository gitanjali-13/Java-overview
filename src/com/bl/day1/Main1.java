package com.bl.day1;

public class Main1 {
    void m1(int a, char c) {
        System.out.println("m1 method");
        System.out.println(a);
        System.out.println(c);
    }

    static void m2(String s, double d) {
        System.out.println("m2 method");
        System.out.println(s);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        m.m1(1, 'g');
        Main1.m2("githa", 10.5);
    }

}

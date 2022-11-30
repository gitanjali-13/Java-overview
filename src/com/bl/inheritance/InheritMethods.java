package com.bl.inheritance;

public class InheritMethods {
    void m1() {
        System.out.println(" parent first method");
    }
}

class Childd extends InheritMethods {
    void m1() {
        System.out.println("In Subclass mehtod");
    }

    void m2() {
        super.m1();
        m1();
    }

    public static void main(String[] args) {
        new Childd().m2();
    }
}
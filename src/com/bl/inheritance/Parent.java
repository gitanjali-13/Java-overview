package com.bl.inheritance;

public class Parent {
    void m1() {
        System.out.println("m1 method");
    }
}

 class Child1 extends Parent {
    void m2() {
        System.out.println("m2 method");
    }

    void m3() {
        System.out.println("m3 method");
    }
}

class Child2 extends Child1 {
    void m4() {
        System.out.println("m4 method");

    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("parent class method:");
        p.m1();
        Child1 ch1 = new Child1();
        System.out.println("child1 and parent class methods :");
        ch1.m1();
        ch1.m2();
        ch1.m3();
        System.out.println("child2, child1 and parent class methods:");
        Child2 ch2 = new Child2();
        ch2.m1();
        ch2.m2();
        ch2.m3();
        ch2.m4();

    }
}
package com.bl.inheritance;

public class SignatureOfMethod {

    void m1() { //final method cannot overriden
        System.out.println("parent method m1");
    }
}

class Base extends SignatureOfMethod {
    void m1() {
        System.out.println("child class method m1");
    }

    void m2() {
        System.out.println("new direct method in child class");
    }

    public static void main(String[] args) {
        SignatureOfMethod mo = new Base();
        mo.m1();//compile time = check this method in parent class but runtime == child class objrct is created so call child class mehtod
        //mo.m2();//compilation error.
        //here we cannot call m2() using parent class object
        Base b1 = new Base();
        b1.m2();
    }
}

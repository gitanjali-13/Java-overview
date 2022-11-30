package com.bl.poly;
//how child class override properties of parent class
public class MethodOverride {
    void sound(){
        System.out.println("Loud ");
    }
}
class Base extends MethodOverride{
    void sound(){
        System.out.println("soft");
    }

    public static void main(String[] args) {
        MethodOverride mo = new MethodOverride();
        mo.sound();
        new Base().sound();
        MethodOverride mo1 = new Base();
        mo1.sound();

    }
}


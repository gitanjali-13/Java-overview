package com.bl.inheritance;


class Animal{

}
class Dog extends Animal{

}
public class MethodOverride {
    Animal sound(){
        System.out.println("loud,soft etc.");
        Animal a = new Animal();
        return a;
    }
}
class Base1 extends MethodOverride {
    Dog sound() {
        System.out.println("bark");
        return new Dog();
    }

    public static void main(String[] args) {
        Base1 b = new Base1();
        b.sound();
        MethodOverride m = new MethodOverride();
        m.sound();
    }
}
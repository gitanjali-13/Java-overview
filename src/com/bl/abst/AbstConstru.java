package com.bl.abst;

abstract class AbstConstru {
    AbstConstru(){
        System.out.println("method");
    };
    abstract void m1();

}
class Demo extends AbstConstru{
    @Override
    void m1() {
        System.out.println("m1 method implementation");
    }

    Demo(){
        super();  //calling parent class constructor
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
    }
}

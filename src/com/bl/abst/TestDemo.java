package com.bl.abst;

abstract class TestDemo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class Test2 extends TestDemo{
    void m1(){
        System.out.println("m1 method implementation");
    }
}
class Test3 extends Test2{
    void m2(){
        System.out.println("m2 method");
    }
    void m3(){
        System.out.println("m3 method ");
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.m1();
        t3.m2();
        t3.m3();
    }
}

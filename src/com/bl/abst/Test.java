package com.bl.abst;

abstract class Test {
    abstract void a1();

    abstract void a2();

    void a3() {
        System.out.println("normal mehtod");
    }
}
class Test1 extends Test {
    @Override
    void a1() {
        System.out.println("a1 method");
    }

    @Override
    void a2() {
        System.out.println("a2 method");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.a1();
        t1.a2();
        t1.a3();
    }

}


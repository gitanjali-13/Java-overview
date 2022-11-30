package com.bl.inheritance;

class Emp{

}
class X{

}
class Y{

}
class Student{

}
public class Main
{
    void m1(X x , Emp e){
        System.out.println("m1 method ...");
    }

    static void m2(Y y , Student s){
        System.out.println("m2 method calling");
    }

    public static void main(String[] args) {
        Main t =  new Main();
        Emp e =  new Emp();
        X x = new X();
        t.m1(x,e);
        Y y = new Y();
        Student s = new Student();
        Main.m2(y,s);

    }
}
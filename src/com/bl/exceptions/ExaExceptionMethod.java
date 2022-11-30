package com.bl.exceptions;

public class ExaExceptionMethod {
    void m1(){
        m2();

    }
    void m2(){
        m3();
    }
    void m3(){
        try {
            System.out.println(2 / 0);
        }catch (ArithmeticException ae){
            System.out.println(ae);
//            System.out.println(ae.getMessage());
//            System.out.println(ae.toString());
//            ae.printStackTrace();
        }
    }
    void m4(){
        m1();
    }
    public static void main(String[] args) {
        ExaExceptionMethod e1 = new ExaExceptionMethod();
        e1.m1();
    }
}

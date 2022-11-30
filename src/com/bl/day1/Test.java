package com.bl.day1;

public class Test {

    Test(){
        this(10);
        System.out.println("0- args const");
    }
    Test(int a){
        System.out.println("1-args constructor.");
    }
//    Test(int a, int b){
//        System.out.println("2-args const");
//    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        new Test();
        new Test(10);
//        new Test(20,30);
    }

}

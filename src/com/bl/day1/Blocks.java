package com.bl.day1;

public class Blocks {
    {
        System.out.println("instance block-1");
    }
    {
        System.out.println("Instance block-2");
    }
    static {
        System.out.println("static block -1");
    }
    static {
        System.out.println("static block-2");
    }
    Blocks(){
        System.out.println("0-args constructor");
    }
    Blocks(int a){
        System.out.println("1-args constructor");
    }

    public static void main(String[] args) {
        new Blocks();
        new Blocks(10);
    }
}

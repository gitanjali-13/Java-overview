package com.bl.exceptions;

import java.util.Scanner;
public class ExampleOfThrow {
    static void status (int age){
        if (age > 18){
            System.out.println("you are eligible.");
        }else {
            throw new ArithmeticException("Not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        System.out.println();
        int age = sc.nextInt();
        ExampleOfThrow.status(age);
    }
}

package com.bl.array.string;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {

        int a, b, c, largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("first number");
        a = sc.nextInt();
        System.out.println("second number");
        b = sc.nextInt();
        System.out.println("thirsd number");
        c = sc.nextInt();
        largest = c> (a>b ? a:b) ? c:((a> b )?a:b);
        System.out.println("largest number" +largest);
    }
}

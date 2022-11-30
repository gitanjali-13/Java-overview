package com.bl.exceptions;

public class ExaFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
//        catch (ArithmeticException ae){
//            System.out.println("exception handled");
//        }
        catch (NullPointerException ne){
            System.out.println("Null pointer excetion");
        }
        finally {
            System.out.println("this block executed either exception handled or not.");
        }

    }
}

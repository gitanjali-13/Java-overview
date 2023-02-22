package com.bl.search;

public class Practice2 {
    public static void main(String[] args) {
        int numOfRows = 5;
        int position = 5;
        int star = 1;
        for (int i = 0; i <= numOfRows; i++) {
            for (int j = 1; j <= position; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star = star + 2;
            position--;
        }
    }
}

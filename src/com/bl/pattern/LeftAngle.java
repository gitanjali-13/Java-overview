package com.bl.pattern;

public class LeftAngle {
    public static void main(String[] args) {
        int position = 3;
        int star = 1;
        for (int i = 0; i <= 3; i++){
            for (int j = 1; j <=position; j ++){
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k ++){
                System.out.print("*");
            }
            position--;
            star++;
            System.out.println();
        }
    }
}

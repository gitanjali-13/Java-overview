package com.bl.pattern;

public class DiamondShape {
    public static void main(String[] args) {
        int star = 1;
        int rows = 5;

        int mid = (rows + 1) / 2;
        int position = mid - 1;
        for (int i = 1; i <= rows; i ++){
            for (int j =1; j <=position ; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k ++){
                System.out.print("*");
            }
            System.out.println();
            if (i < mid){
                star = star + 2;
                position--;

            }else {
                star = star - 2;
                position++;
            }
        }
    }
}

package com.bl.array.string;

public class RevesreArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 9, 10, 3, 2, 8, 4};
        System.out.println("Original array :");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
            System.out.println("array length" +arr.length);
        };
        System.out.println();
        System.out.println("reverse array :");
        for (int i = arr.length - 1; i >= 0; i --){
            System.out.print(arr[i]+ " ");
        }
    }
}

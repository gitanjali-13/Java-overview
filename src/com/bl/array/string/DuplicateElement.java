package com.bl.array.string;

//Find duplicate element in array[2, 4, 5, 7, 2, 9, 0]


public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 2, 9, 0};

        System.out.println("Duplicate element :");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    System.out.println(" " + arr[j]);
                }
            }
        }

    }

}


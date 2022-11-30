package com.bl.array.string;

import java.util.Arrays;
import java.util.Collections;

public class ExampleSortArray {
    public static void main(String[] args) {
        int arr[] = {2,4,15,7,8,12,1,0,19,};
        int temp = 0;
        System.out.println("original array");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i <arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if ( arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.print(arr[i]);
        }
    }
}

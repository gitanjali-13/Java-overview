package com.bl.search;

public class LinearSearch1 {
    public static int liner(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 9, 10};
        int element = 5;
        int found = liner(arr,element);
        if (found == -1){
            System.out.println("element not present in arrya");
        }else {
            System.out.println("element present at :" +found);
        }

    }
}

package com.bl.search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,5,8,6,9};
        int number = 8;
//        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                System.out.println(number+ " element present at " +i+ " position" );
//                temp = temp + 1;
            }
//            if (temp == 0){
//                System.out.println("element not found.");
//            }
        }
    }
}

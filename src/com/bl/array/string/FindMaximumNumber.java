package com.bl.array.string;

public class FindMaximumNumber {

    public static void main(String[] args) {
        int[] array = {2,4,5,1,8,9};
        int maximun = array[0];
        for (int i = 0; i < array.length; i ++){
            if (array[i] > maximun){
                maximun = array[i];

            }
        }
        System.out.println("maximum number :" +maximun);
    }
}

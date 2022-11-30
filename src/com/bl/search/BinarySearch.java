package com.bl.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9, 10, 11, 12, 23, 45};
        int searchElement = 23;
        int startIndex = 0;
        int LastIndex = arr.length - 1;
        int middleIndex = (startIndex + LastIndex) / 2;

        while (startIndex <= LastIndex) {

            if (arr[middleIndex] == searchElement) {
                System.out.println("element " + searchElement + " present at index " + middleIndex);
                break;
            } else if (arr[middleIndex] < searchElement) {
                startIndex = middleIndex + 1;

            } else {
                LastIndex = middleIndex - 1;
            }
            middleIndex = (startIndex + LastIndex) / 2;
        }
        System.out.println("END of program");
    }
}

package com.bl.search;

public class LinearSearchName {
    public static void main(String[] args) {
        String[] str = {"Gitanjali","anjali", "rohit","manoj"};
        String str1 = "manoj";

        for (int i=0; i<str.length; i++){
            if (str[i].equals(str1)){
                System.out.println( str1+ " string present at position " +i);
            }
        }

    }
}

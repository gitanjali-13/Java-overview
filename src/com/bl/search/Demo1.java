package com.bl.search;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        int num = 2;
        list.add(num);
        Integer value = 2;
        int value1 = 4;
        value = value1;
        value1 = value;
        list.add(value);

        System.out.println(list);
    }
}

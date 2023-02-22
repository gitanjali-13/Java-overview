package com.bl.search;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ram");
        arr.add("shyam");
        arr.add("hello");
        arr.add("world");
        arr.add(null);
        arr.add("ram");
        System.out.println(arr);
        System.out.println();
        arr.add(2, "new object");
        //arr.get(3);
        arr.remove(1);
        System.out.println(arr);
    }
}

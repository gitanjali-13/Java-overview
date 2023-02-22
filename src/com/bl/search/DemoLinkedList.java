package com.bl.search;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.set(1, "eee");
        list.removeLast();
//        list.addFirst("fff");
        System.out.println(list);
    }
}

package com.bl.array.string;

public class EqualsMethod {
    EqualsMethod(String str){

    };

    public static void main(String[] args) {
        EqualsMethod e = new EqualsMethod("ratan");
        EqualsMethod e1 = new EqualsMethod("ratan");
        System.out.println(e.equals(e1));

        String s1 = "Anu";
        String s2 = "Anu";
        System.out.println(s1.equals(s2));

        StringBuffer sb = new StringBuffer("gita");
        StringBuffer sb1 = new StringBuffer("gita");
        System.out.println(sb.equals(sb1));
        System.out.println(sb.toString().equals(sb1.toString()));
        System.out.println(sb.toString());
        System.out.println(sb1.toString());

    }
}

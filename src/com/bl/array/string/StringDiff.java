package com.bl.array.string;

public class StringDiff {
    public static void main(String[] args) {
        String s1 = "Ratan";
        System.out.println(s1);
        System.out.println(s1.toString());

        StringBuffer sb = new StringBuffer("anu");
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
class Object {
    @Override
    public java.lang.String toString() {
        return "content of string object";

    }

    class String extends Object {
        @Override
        public java.lang.String toString() {
            return "classname@hashcode";

        }

        class StringBuffer extends Object {
            @Override
            public java.lang.String toString() {
                return "content of stringbuffer object ";
            }
        }
    }
}
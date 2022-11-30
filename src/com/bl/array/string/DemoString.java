package com.bl.array.string;

public class DemoString {
    public static void main(String[] args) {
        String s1 = "gita";
        s1.concat("deshmukh");//Stirng are not mutable that is immutable in nature.
        System.out.println(s1);

        String s2 = "ram";
        System.out.println(s2);
        String s3 = "shyam";
        System.out.println(s3);


        StringBuffer sb = new StringBuffer("Durga");//StringBuffer is mutable in nature.
        sb.append("soft");
        System.out.println(sb);




    }
}

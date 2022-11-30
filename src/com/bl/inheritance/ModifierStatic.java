package com.bl.inheritance;

public class ModifierStatic {
    static void name(){
        System.out.println("parent method");
    }
}
class Childclass extends ModifierStatic{
    static void name(){
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        ModifierStatic ms = new Childclass();
        ms.name();
    }
}

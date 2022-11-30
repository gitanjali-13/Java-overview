package com.bl.inheritance;

public class ParentCont {
    ParentCont() {
        System.out.println("parent class constructor");
    }
}
    class ChildClass extends ParentCont{
        ChildClass(){
            this(10);
            System.out.println("child class constructor");
        }
        ChildClass(int a){
            super();
            System.out.println("second child class constructor with parameters");
        }

        public static void main(String[] args) {
            new ChildClass();
        }
}


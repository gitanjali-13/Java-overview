package com.bl.abst;

abstract class BlocksInAbst {
    BlocksInAbst() {
        System.out.println("constructor");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }
}

class Test4 extends BlocksInAbst {
    Test4() {
        super();
        System.out.println("child class construcotr");
    }

    public static void main(String[] args) {
        Test4 t4 = new Test4();
        new Test4();
    }
}

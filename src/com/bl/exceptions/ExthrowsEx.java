package com.bl.exceptions;

import java.io.IOException;

public class ExthrowsEx {
    void show() throws  IOException {
        throw new IOException();
    }
    void mro() throws InterruptedException {
        System.out.println("Sleeping mode");
        Thread.sleep(3000);
    }
    void mOffice() throws InterruptedException{
        mro();
    }
    void eseva(){
        try {
            mOffice();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        ExthrowsEx ex = new ExthrowsEx();
//        ex.eseva();
        ex.show();
    }
}

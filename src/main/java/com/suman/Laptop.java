package com.suman;

public class Laptop implements Computer {

    @Override
    public void compile(){
        System.out.println("Compiling in Laptop");
    }

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

}

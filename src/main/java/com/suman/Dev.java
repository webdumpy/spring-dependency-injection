package com.suman;


public class Dev {
    private Computer com;
    private int age;


    public Dev(){
        System.out.println("Dev Constructor");
    }

//    public Dev(Laptop laptop) {
//
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor");
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("First project");
        //laptop.compile();
    }
}

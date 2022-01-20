package com.certification.chapter_8_class_design;

class GiraffeFamily {
    static {
        System.out.print("A"); //1
    }

    {
        System.out.print("B");//1
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");//3
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");// 2
    }
}

public class Okapi extends GiraffeFamily {
    static {
        System.out.print("F");//2
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H");//5
    }

    public static void main(String[] grass) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}
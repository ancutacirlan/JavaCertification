package com.certification.chapter_7_methods_and_encapsulation;

import java.util.Objects;

public class Overloading {
    public static void main(String... arg) {
        fly(new int[]{1, 2, 3});
        fly(1, 2, 3);

        fly(2);
        fly(new Integer(3));

        n(2);
        n((int)2L);

    }

    //    public static void fly(int[] lengths) {
//        System.out.println(lengths.length);
//    }
    public static void fly(int... lengths) {
        System.out.println(lengths.length);
    }

    public static void fly(int numMiles) {
        System.out.println("int");
    }
    public static void fly(Integer numMiles) {
        System.out.println(numMiles.getClass().getName());
    }

    public static void n(int i) {
        System.out.println("int");
    }
//    public static void n(long l) {
//        System.out.println("long");
//    }

}

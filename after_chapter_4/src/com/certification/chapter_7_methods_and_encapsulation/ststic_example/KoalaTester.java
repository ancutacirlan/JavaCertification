package com.certification.chapter_7_methods_and_encapsulation.ststic_example;

public class KoalaTester {

    public static void main(String[] args) {
        Koala.main(new String[0]);
        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        k.count = 4;
        System.out.println(k.count);

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
        System.out.println(koala1.count);
        System.out.println(koala2.count);
    }
}
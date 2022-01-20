package com.certification.chapter_8_class_design;

public class ZooTickets {
    private String name = "BestZoo"; //2

    {
        System.out.print(name + "-"); //2
    }

    private static int COUNT = 0; //1

    static {
        System.out.print(COUNT + "-"); //1
    }

    static {
        COUNT += 10;
        System.out.print(COUNT + "-"); //1
    }

    public ZooTickets() {
        System.out.print("z-");//3
    }

    public static void main(String... patrons) {
        new ZooTickets();
    }
}
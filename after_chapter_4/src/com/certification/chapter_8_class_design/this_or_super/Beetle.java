package com.certification.chapter_8_class_design.this_or_super;

class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.print(this.label); //buggy
        System.out.print(super.label); // buggy
        System.out.print(this.age); // 3
//        System.out.print(super.age);// error
        System.out.print(numberOfLegs);//6
    }

    public static void main(String[] n) {
        new Beetle().printData();
    }
}
package com.certification.chapter_9_advanced_class_design;

//class Bird {
//    public String getName() { return null; }
//    public void printName() {
//        System.out.print(getName());
//    }
//}
//public class Stork extends Bird {
//    public String getName() { return "Stork!"; }
//    public static void main(String[] args) {
//        new Stork().printName();
//        new Bird().printName();
//    }
//}

abstract class Bird {
    public abstract String getName();
    public void printName() {
        System.out.print(getName());}
}
public class Stork extends Bird {
    public String getName() { return "Stork!"; }
    public static void main(String[] args) {
        new Stork().printName();
    }
}
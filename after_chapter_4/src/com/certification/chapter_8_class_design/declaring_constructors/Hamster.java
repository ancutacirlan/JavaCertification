package com.certification.chapter_8_class_design.declaring_constructors;


public class Hamster {
    private String color;
    private int weight;

//    public Hamster(int weight) {
//        this.weight = weight;
//        color = "brown";
//    }

//    public Hamster(int weight) {
//        new Hamster(weight, "brown");   //         It then constructs a different object with the desired weight
//                                                      and color and ignores the new object.
//    }

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
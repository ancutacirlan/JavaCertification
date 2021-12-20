package com.certification.chapter_6_lambda_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class VariableInLambda {

    private String color;

    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
    }

    public void caw2(String name) {
        String volume = "loudly";
        name = "Alex";
        color = "black";
      //  Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
        volume = "softly";
    }


//    public void variables(int a) {
//        int b = 1;
//        Predicate<Integer> p1 = a -> {
//            int b = 0;
//            int c = 0;
//            return b == c;}}
}

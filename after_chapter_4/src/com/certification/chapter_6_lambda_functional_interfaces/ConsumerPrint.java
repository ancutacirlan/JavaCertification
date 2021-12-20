package com.certification.chapter_6_lambda_functional_interfaces;

import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main (String ... args)
    {

        Consumer<String> consumer = x-> System.out.println(x);
        print(consumer,"Hello word");
        consumer.accept("To strings");

    }

    private static void print(Consumer<String> consumer, String value){
        consumer.accept(value);
    }

}

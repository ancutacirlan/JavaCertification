package com.certification.chapter_5_coreJavaAPIs;

public class UnderstandingEquality {

    public static void main(String ... arg){

        System.out.println("-------- comparing equals and == ---------");

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Hello World";
        String z = " Hello World".trim();

        System.out.println("-------- string pool ---------");

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern());//true
        System.out.println(first == third);//false
        System.out.println(first == third.intern());//true
    }
}

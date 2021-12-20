package com.certification.chapter_7_methods_and_encapsulation;

public class PassingDataAmongMethods {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num); //4
        System.out.println(num);
        num = newNumber(num); //8
        System.out.println(num);


        String name = "Webby";
        speak(name);//Webby
        name = speak(name); // Sparky
        System.out.println(name);


    }


    public static int newNumber(int num) {
        num = 8;
        return num;
    }
    public static String speak(String name) {
        name = "Sparky";
        return  name;
    }
}

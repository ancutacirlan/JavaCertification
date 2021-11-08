package com.company;

public class Main {

    public static void main(String[] args) {

//        double a = _1000; //DOES NOT COMPILE
        double b = 1_000.000;
//        double c = 100_.000; //DOES NOT COMPILE
//        double d = 1000._000; //DOES NOT COMPILE
        double e = 10_0.000;
        double f = 1000.0_000;
//        double notAtStart = _1000.00; //DOES NOT COMPILE
//        double notAtEnd = 1000.00_; //DOES NOT COMPILE
//        double notByDecimal = 1000_.00; //DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0;
        double reallyUgly = 1__________2;

        boolean b1, b2;
        String s1 = "1", s2;
//        double d1, double d2; //DOES NOT COMPILE
        int i1; int i2;
//        int i3; i4; //DOES NOT COMPILE

    }
}

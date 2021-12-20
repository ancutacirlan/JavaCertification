package com.certification.chapter_7_methods_and_encapsulation;

import java.util.ArrayList;

public class StaticAndFinal {
    private static final int NUM_BUCKETS = 45;
    private static final int NUM_BUCKETS2;

    static {
        NUM_BUCKETS2 = 25;
    }

    private static int count = 0;
    private static final ArrayList<String> values = new ArrayList<>();

    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR
                = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }

    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four;

    static {
        one = 1;
        two = 2;
        //three = 3;
        //two = 4;
        four = 7;
    }


    public static void main(String[] args) {
        count = 2;
//        NUM_BUCKETS = 5; illegal
        values.add("sdfas");
        values.add("feswef");
        values.add("f");
        values.remove("f");
        System.out.println(values);
        System.out.println(count);
        System.out.println(NUM_BUCKETS2);

        System.out.println(NUM_SECONDS_PER_MINUTE);
        System.out.println(NUM_MINUTES_PER_HOUR);
        System.out.println(NUM_SECONDS_PER_HOUR);
    }
}
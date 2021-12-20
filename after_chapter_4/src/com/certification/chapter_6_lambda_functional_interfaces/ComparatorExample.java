package com.certification.chapter_6_lambda_functional_interfaces;

import java.util.Comparator;

public class ComparatorExample {
    public static void main (String[]args)
    {
        Comparator<Integer> comparator = (i1, i2) -> i1 - i2;
        int a = 2;
        int b = 5;
        System.out.println(returnNumber(comparator,a,b));
    }

    private static int returnNumber(Comparator<Integer> comparator, int a, int b) {
        return comparator.compare(a,b);

    }
}

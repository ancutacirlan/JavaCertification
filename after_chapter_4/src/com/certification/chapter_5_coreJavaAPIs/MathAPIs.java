package com.certification.chapter_5_coreJavaAPIs;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.random;

public class MathAPIs {
    public static void main(String ... args){

        System.out.println(min(7, 9.6));
        System.out.println(min(7, 9));
        System.out.println(min(8, 9.6));

        System.out.println(max(7, 9.6));
        System.out.println(max(7, 9));

        System.out.println(random());
    }
}

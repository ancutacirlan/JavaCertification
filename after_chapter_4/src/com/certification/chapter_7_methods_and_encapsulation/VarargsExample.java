package com.certification.chapter_7_methods_and_encapsulation;

public class VarargsExample {
    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1);
        walk(1, 2);
        walk(1, 2, 3);
        walk(1, new int[]{4, 5});
    }
}

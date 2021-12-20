package com.certification.chapter_5_coreJavaAPIs;

public class StringBuilderClass {


    public static void main(String[] args) {

        System.out.println("----------exercise------------");

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");// a=abcde, b=abcde
        b = b.append("f").append("g");//a=b=abcdefg
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("----------exercise------------");

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        System.out.println("----------insert------------");

        StringBuilder sbr = new StringBuilder("animals");
        sbr.insert(7, "-");// sb = animals-
        sbr.insert(0, "-");// sb = -animals-
        sbr.insert(4, "-");// sb = -ani-mals-
        System.out.println(sbr);

        System.out.println("----------replace------------");

        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "abcdeshdgjhdhgkf");
        System.out.println(builder);

    }
}

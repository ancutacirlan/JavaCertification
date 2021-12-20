package com.certification.chapter_5_coreJavaAPIs;

public class StringClass {


        public static void main(String[] args) {
            System.out.println("----------startWith method------------");

            System.out.println("abc".startsWith("ab")); // true
            System.out.println("abc".startsWith("A")); // false

            System.out.println("----------endWith method------------");

            System.out.println("abc".endsWith("c")); // true
            System.out.println("abc".endsWith("a")); // false


            System.out.println("----------replace method------------");

            System.out.println("abcabc".replace('a', 'A')); // AbcAbc
            System.out.println("abcabc".replace("ab", "RR")); // RRcRRc

            System.out.println("----------strip, trim method------------");

            System.out.println("abc".strip());//abc
            System.out.println("\t a b c\n".strip());// a b
                    String text = " abc\t ";
            System.out.println(text.trim().length());

            System.out.println(text.strip().length());

            System.out.println(text.stripLeading().length()); //
            System.out.println(text.stripTrailing().length());//3354

            System.out.println("----------exercise------------");
            String a = "abc";
            String b = a.toUpperCase();//ABC
            b = b.replace("B", "2").replace('C', '3');//A23
            System.out.println("a=" + a);//abc
            System.out.println("b=" + b);//A23

        }

}

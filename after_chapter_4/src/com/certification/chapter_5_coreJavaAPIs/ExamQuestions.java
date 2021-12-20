package com.certification.chapter_5_coreJavaAPIs;

import java.util.ArrayList;
import java.util.List;

public class ExamQuestions {
    public static void main(String ... args){

        int count = 0;
        String s1 = "java";
        String s2 = "java";
        StringBuilder s3 = new StringBuilder("java");
        if (s1 == s2) count++;
        if (s1.equals(s2)) count++;
        //if (s1 == s3) count++;
        if (s1.equals(s3)) count++;
//        System.out.println(count);

        List chimpanzees = new ArrayList<Integer>();
        chimpanzees.add("Syier");
        chimpanzees.add(13);
        for(var ham : chimpanzees)
            System.out.println(ham.getClass().getName());


    }
}

package com.certification.chapter_5_coreJavaAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnderstandingArrays {

    public static void main (String ... args){


        System.out.println("------------SORTING-----------");

        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int number : numbers) System.out.print(number + " ");

        System.out.println("------------SEARCHING-----------");

        int[] number = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));

        System.out.println("------------COMPARING-----------");

        System.out.println(Arrays.compare(new int[] {1}, new int[]{2}));

        int[] vars4 [], space [][];

        System.out.println("------------ArrayList-----------");


        ArrayList list1 = new ArrayList();
        list1.add("list");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList();
        list2.add("list1");
        list2.add("list2");

        System.out.println(list2);

        System.out.println("------------ArrayList into Array-----------");

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectsArray = list.toArray();
        String[] stringsArray = list.toArray(new String[0]);

        list.clear();
        System.out.println(objectsArray.length);
        System.out.println(stringsArray.length);

        System.out.println("------------Array into List-----------");

        String [] array = {"hawk","robin"};
        List<String> list3 = Arrays.asList(array);
        System.out.println(list3.size());
        list3.set(1,"test");
        array[0] = "new";
        System.out.println(Arrays.toString(array));
        //list3.remove(1);
        //list3.add("jh");
        System.out.println(list3.size());
        System.out.println(Arrays.toString(array));



        String [] array1 = {"hawk","robin"};
        List<String> list4 = List.of(array1);
        System.out.println(list4.size());
        //list4.set(1,"test");
        //list4.add("iuh");
        array1[0] = "new";
        System.out.println(Arrays.toString(array1));

        List<Integer> numberss = new ArrayList<>();
        numberss.add(99);
        numberss.add(5);numberss.add(81);
        Collections.sort(numberss);
        System.out.println(numberss); // [5, 81, 99]









    }
}

package com.certification.chapter_5_coreJavaAPIs;

import java.util.*;

public class CreatingSetAndMap {
    public static void main(String ... args){

        Set<Integer> set = new TreeSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false
        System.out.println(set.add(44));
        System.out.println(set.add(88));
        System.out.println(set.add(11));
        System.out.println(set.size());
        System.out.println(set);System.out.println(set); // true

        System.out.println("------MAP---------\n");
        Map<String, String> map = new HashMap<>();
        map.put("k", "koala");
        map.put("m", "monkey");
        map.put("l", "lion");
        System.out.println(map.get("koala"));// null
        System.out.println(map.get("m"));// monkey
        System.out.println(map.getOrDefault("ant", "leaf")); //leaf
        System.out.println(map.getOrDefault("l", "leaf")); //lion
        System.out.println(map.containsKey("k"));
        System.out.println(map.containsKey("r"));
        System.out.println(map.containsValue("lion"));
        System.out.println(map.containsValue("r"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (String key: map.keySet())
        System.out.println(key + " " + map.get(key)); //koala bamboo

    }
}

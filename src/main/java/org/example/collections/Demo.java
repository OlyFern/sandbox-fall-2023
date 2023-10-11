package org.example.collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        //Set<String> set = new HashSet<>();
        //Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();

        set.add("hello");
        set.add("hola");
        set.add("olo");
        set.add("howdy");

        for (String s : set) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hola");
        list.add("olo");
        list.add("howdy");

        list.forEach(System.out::println);


    }
}

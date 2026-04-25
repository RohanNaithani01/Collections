package org.example.ListsClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cheery");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Date");
        fruits.add("Cheery");

        fruits.remove("Apple");
        System.out.println(fruits);

        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(21);
        list.add(3);

        list.remove(Integer.valueOf(1));
        System.out.println(list);
        list.sort(null);
        Collections.sort(list);
        System.out.println(list);

    }
}
//        List<Integer> list= new ArrayList<>();
//        List<Integer> list1=List.of(1,2,3,4,5);
//
//        list.addAll(list1);
//        System.out.println(list);
// ArrayList<Integer> list=new ArrayList<>();
//        list.add(12);
//        list.add(21);
//        list.add(30);
//        list.add(40);
//
//        System.out.println(list.get(0));
//        System.out.println(list.get(3));
//        for (int i:list){
//            System.out.println(i);
//        }
//
//        System.out.println(list.contains(20));
//        System.out.println(list.contains(40));
//        System.out.println(list);
//        list.add(2,50);
//        list.add(0,1);
//
//        for (int i:list){
//            System.out.println(i);
//        }
//
//        System.out.println(list);
//        list.set(0,3);
//        list.set(2,50);
//
//        System.out.println(list);
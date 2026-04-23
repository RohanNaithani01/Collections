package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        list.add(2,243);
//        list.set(2,34);
//        for(int x:list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(54));
//        System.out.println(list);

        List<String> list2=new ArrayList<>();
        list2.add("Rohan");
        list2.add("Rohit");
        list2.add("Rahul");

        System.out.println(list2);
        System.out.println(list2.get(2));
        list2.set(2,"Ravi");
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);

        list2.add(1,"Ramesh");
        System.out.println(list2);

        System.out.println(list2.contains("Rohan"));
    }
}

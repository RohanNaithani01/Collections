package org.example;

import java.util.*;

public class NewList {
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(23);
        list1.add(21);
        list1.add(24);
        list1.add(34);
        System.out.println(list1);
        list1.addFirst(11);
        list1.addFirst(1);
        System.out.println(list1);

        Object o= list1.get(0);


    }
}

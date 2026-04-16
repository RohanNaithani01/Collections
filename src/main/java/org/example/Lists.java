package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(2));
        System.out.println(list.size());
        list.add(2,243);
        list.set(2,34);
        for(int x:list){
            System.out.println(x);
        }
        System.out.println(list.contains(4));
        System.out.println(list.contains(54));
        System.out.println(list);

    }
}

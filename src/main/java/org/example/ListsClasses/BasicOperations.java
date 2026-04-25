package org.example.ListsClasses;

import java.util.ArrayList;
import java.util.List;

public class BasicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        List<Integer> list1= List.of(1,2,3,4,5,6,7,8);
        list.addAll(list1);
        list.add(1);
        list.add(2);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(int i:list){
            System.out.println(i);
        }

        System.out.println(list);

        list.add(2,30);
        System.out.println(list);
        list.remove(1);
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        System.out.println(list.contains(2));
        System.out.println(list.indexOf(30));
    }
}

package org.example.ListsClasses;

import java.util.LinkedList;

public class LinkedListBasics {
    static void main() {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.addFirst(2);
        list.addLast(3);

        for(int i:list){
            System.out.println(i);
        }

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));

        list.add(2,4);
        list.addLast(5);
        list.addFirst(0);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);


    }
}

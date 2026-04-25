package org.example.ListsClasses;

import java.util.LinkedList;

public  class Test {
    static void main() {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);

    }
}


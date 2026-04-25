package org.example.ListsClasses;

import java.util.Vector;

public class Vectordemo {
    static void main() {
        Vector<Integer> vector= new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);

        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
    }
}

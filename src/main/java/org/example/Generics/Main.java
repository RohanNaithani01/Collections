package org.example.Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> list= new Box<>();
        list.setValue(1);
        System.out.println(list.getValue());
    }
}

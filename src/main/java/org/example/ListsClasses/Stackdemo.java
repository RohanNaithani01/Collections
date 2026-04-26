package org.example.ListsClasses;

import java.util.Stack;

public class Stackdemo {
    static void main() {
        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search= stack.search(3);
        System.out.println(search);
    }
}

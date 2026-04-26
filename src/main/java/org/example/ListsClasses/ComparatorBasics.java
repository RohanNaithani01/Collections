package org.example.ListsClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparatorBasics {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);

        list.sort((a,b)->b-a);
        System.out.println(list);
        list.sort((a,b)->a-b);
        System.out.println(list);


        List<String> fruits= Arrays.asList("Apple","Banana","bat","cat");
        fruits.sort((a,b)->a.length()-b.length());
        System.out.println(fruits);


        List<Student> students=new ArrayList<>();
        students.add(new Student("Rohan",4.8));
        students.add(new Student("Rohit",2.5));
        students.add(new Student("Mohit",3.5));
        students.add(new Student("Alex",4.0));


        students.sort((a,b)->{
            if(b.getGpa()-a.getGpa()>0){
                return 1;
            } else if (b.getGpa()-a.getGpa()<0) {
                return -1;
            }
            else {
                return 0;
            }
        });

        for (Student s:students){
            System.out.println(s.getName()+": "+ s.getGpa());
        }

    }
}

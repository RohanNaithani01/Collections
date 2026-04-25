package org.example.ListsClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
public class JavaComparator {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("Alics",3.5));
        students.add(new Student("Rohan",4.5));
        students.add(new Student("Rohit",2.5));
        students.add(new Student("Mohit",4.0));

        students.sort((a,b)-> {
            if(b.getGpa()-a.getGpa()>0){
                return 1;
            } else if (b.getGpa()-a.getGpa()<0) {
                return -1;
            }else {
                return 0;
            }
        });
        for(Student s:students){
            System.out.println(s.getName()+": "+s.getGpa());
        }


//        List<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(6);
//        list.add(4);
//        list.add(1);
//        list.add(5);
//
//        list.sort(new MyComparator());
//        System.out.println(list);
//
//        List<String> list2= Arrays.asList("Apple","Banana","Date");
//        list2.sort((a,b)-> b.length()-a.length());
//        System.out.println(list2);


    }
}

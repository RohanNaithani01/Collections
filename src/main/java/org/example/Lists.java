package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(80);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        for (int x: arrayList){

        }
    }
}

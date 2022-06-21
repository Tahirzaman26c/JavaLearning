package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void Show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.add(0,"!");
        System.out.println(list);
        // sab hota hai issme SEt REMOVE INDEXOF LASTINDEXOF SUBLIST etc
    }
}

package com.codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void Show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b");

        Collection<String> others = new ArrayList<>();
        // both collection and other are not equal but they have same content
        // Not equal becz unke aage new likha hai it means wo naye reference ko target karrahe




//        var objectArray =collection.toArray();
//        var stringArray = collection.toArray(new String[0]);


//        System.out.println(collection);

//        System.out.println(collection.isEmpty());
//        collection.clear();
//        collection.remove("a");
//        for (var item : collection)
//            System.out.println(item);

    }
}

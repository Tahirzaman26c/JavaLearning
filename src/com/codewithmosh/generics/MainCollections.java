package com.codewithmosh.generics;

public class MainCollections {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item : list.items);
    }
}

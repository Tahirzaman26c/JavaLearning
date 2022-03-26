package com.codewithmosh.generics;

public class KeyValuePairs <K,V>{
    private K key;
    private V value;

    public KeyValuePairs(K key, V value){
        this.key = key;
        this.value = value;
    }
}

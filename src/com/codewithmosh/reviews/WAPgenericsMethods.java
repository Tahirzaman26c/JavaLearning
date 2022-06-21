package com.codewithmosh.reviews;

public class WAPgenericsMethods {
    public static <T extends Comparable<T>>T max(T first,T second){
            return (first.compareTo(second)<0)?second:first;
    }
}

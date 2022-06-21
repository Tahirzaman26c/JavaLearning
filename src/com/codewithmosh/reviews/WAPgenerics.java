package com.codewithmosh.reviews;

//    Elimination of casts.
//    The following code snippet without generics requires casting:
//
//    List list = new ArrayList();
//    list.add("hello");
//    String s = (String) list.get(0);
//
//    When re-written to use generics, the code does not require casting:
//
//    List<String> list = new ArrayList<String>();
//    list.add("hello");
//    String s = list.get(0);   // no cast
public class WAPgenerics<T> {
    public T[] items =(T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++]= item;
    }
    public T get(int index){
        return items[index];
    }
}




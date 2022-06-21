package com.codewithmosh.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void Show(){
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b");

    //b -> a -> c
    var front = queue.peek();  // element Showa exception if queue empty where peek Showa null
        // remove method remove the item at the front that is c
        //poll returns null if the queue is empty
        System.out.println(front);
    }
}

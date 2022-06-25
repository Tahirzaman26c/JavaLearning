package com.codewithmosh.rivision.genericsRev;

public class User implements Comparable<User>{
    private int points;

    public User(int points) {
        this.points = points;
    }
    @Override
    public int compareTo(User Other) {
        return points - Other.points;
    }
}

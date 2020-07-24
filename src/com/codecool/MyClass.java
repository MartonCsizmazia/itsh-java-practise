package com.codecool;


import java.util.List;

public abstract class MyClass {
    public int counter;

    protected void increaseCounter(){
        counter++;
    }
    public abstract int numberOfPositiveElements(List<Integer> numbers);
}
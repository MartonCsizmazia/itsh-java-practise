package com.codecool;

public class Animal {

    //private int nubmer = null; NOT WORKING
    private Integer number2 = null;

    public static void testStaticMethod() {
        System.out.println("The static method in Animal");
    }

    //NEM HÍVHATÓ
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}
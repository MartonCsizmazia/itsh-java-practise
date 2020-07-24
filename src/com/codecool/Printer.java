package com.codecool;

public class Printer {

    private int a;
    private int b;

    public Printer(int a, int b) {
        announcer("a printer is initiated");
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(this.a + this.b);
    }

    public void announcer(String message){
        System.out.println(message);
    }

    public static void mystat(){
        new Printer(5,5).announcer("static method is used");
    }

    public static void mystat2(){
        System.out.println("static method2");
    }

}

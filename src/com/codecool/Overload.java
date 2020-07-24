package com.codecool;

public class Overload {

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }

    public String sum(int x, int y, String message) {

        return (message +(x+y));
    }

}

package com.codecool.UpAndDownCasting;

public abstract class Fruit implements Food {
    public float getTotalCalories(){
        return 0.50f;
    }
    abstract public String getOrigin();
}

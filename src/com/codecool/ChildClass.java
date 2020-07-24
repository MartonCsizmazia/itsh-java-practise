package com.codecool;

import java.util.List;

public class ChildClass extends MyClass{

    @Override
    public int numberOfPositiveElements(List<Integer> numbers) {
        /*
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>=0){
                increaseCounter();
            }
        }
         */

        for (Integer number : numbers) {
            if (number >= 0) {
                increaseCounter();
            }
        }
        return counter;
    }
}

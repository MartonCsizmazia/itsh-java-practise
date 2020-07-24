package com.codecool;

import com.codecool.UpAndDownCasting.Apple;
import com.codecool.UpAndDownCasting.Fruit;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("HEllo World");

        Printer printer = new Printer(1,1);

        printer.add();

        Printer.mystat();

         */
        /*
        Cat myCat = new Cat();
        Animal myAnimal = myCat;

        Animal.testStaticMethod();
        myCat.testStaticMethod();
        myAnimal.testStaticMethod();
        Cat.testStaticMethod();

        myAnimal.testInstanceMethod();
        myCat.testInstanceMethod();

        //DOWNCASTING
        Fruit fruit = new Apple();
        Apple castedApple = (Apple) fruit;

        System.out.println(fruit.getTotalCalories());
        System.out.println(castedApple.getTotalCalories());

         */


        //System.out.println(Arrays.toString(GapInPrimes.gap(2, 3, 50)));
        //System.out.println(Arrays.toString(GapInPrimes.gap(2,100,110)));
        //System.out.println(Arrays.toString(GapInPrimes.gap(6,100,110)));
        //System.out.println(GapInPrimes.isPrime(107));
        //System.out.println(GapInPrimes.isPrime(10));

        //List<Integer>  numbers = new Integer(){1, 3, 4, 5, 6, 7};

        Integer[] numbers = new Integer[]{6, 5, 42, 18, 7, 15, 0, -2, -1000};

        List<Integer> numbers2 = Arrays.asList(numbers);

        ChildClass childClass = new ChildClass();


        System.out.println(childClass.numberOfPositiveElements(numbers2));
    }
}

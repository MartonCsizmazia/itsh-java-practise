package com.codecool;

public class Cat extends Animal {



    public static void testStaticMethod() {
        System.out.println("The static method in Cat");
    }


    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
    /*
    The distinction between hiding a static method and overriding an instance method has important implications:


    The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass. called from:Animal
    The version of the overridden instance method that gets invoked is the one in the subclass.     called from:Animal

     */
    /*
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }

     */
}

package com.p5.adoptions.model;

public class Cat extends Animal implements AnimalInterface {

    Integer purrIntensity;
    public Cat(String name, String photo) {
        //Super is mandatory if we have a constructor with parameters in base class
        //MUST BE ON THE FIRST LINE OF THE CHILD'S CONSTRUCTOR
        super(name, photo);
        System.out.println("Constructing a cat");
        this.purrIntensity = 5;
    }

    public Cat() {
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

    @Override
    public String whatDoesItEats() {
        return "Milk";
    }

    @Override
    public String howManyLegs() {
        return "Four";
    }

    //Second example of Polymorphism
    public String customMethodToCats() {
        return "Cats are cool, only cats can do this";
    }

    public String customMethodToCats(String message) {
        return message;
    }

}

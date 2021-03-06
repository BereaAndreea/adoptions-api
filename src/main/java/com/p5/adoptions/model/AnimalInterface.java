package com.p5.adoptions.model;

/**
 * An interfaces defines behaviour
 * If are fields they are public static
 * Pluses:
 * -generic method implementations
 * -defines a contract (defines methods available to be used after initialization)
 * Minuses:
 * -only public static fields
 * -public methods
 */
public interface AnimalInterface {

    String hello = "Hello from animal kingdom";

    String makeSound();

    public String howManyLegs();

    /**
     * Generic implementation, does not depend on details at class level
     * @return
     */
    default String defaultMethod() {
        return "This is an default method";
    }

}

package com.serrodcal;

public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Welcome to SOLID:" );
        System.out.println("S = Single Responsibility Principle: A class should always have one responsibility and there should be only a single reason to change it.");
        System.out.println("O = Open/Closed Principle: Class should be Open for Extension but Closed for Modification.");
        System.out.println("L = Liskov Substitution Principle: Child Classes should be replaceable with Parent Classes without breaking the behavior of our code.");
        System.out.println("I  = Interface Segregation Principle: Interface should only have methods that are applicable to all child classes. If an interface contains a method applicable to some child classes then we need to force the rest to provide dummy implementation. Move such methods to a new interface.");
        System.out.println("D = Dependency Inversion Principle: Class should depend on abstractions (interface and abstract class) instead of concrete implementations. It makes our classes de-coupled with each other. If implementation changes then the class referring to it via abstraction won't change.");
    }
}

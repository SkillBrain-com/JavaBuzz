package javabascis3.abstraction;

import java.util.ArrayList;
import java.util.TreeSet;

public class Wolf extends Animal implements WildAnimal, Flyable{

    @Override
    public void doSomething() {
        System.out.println("Doing something from wolf...");
    }

    @Override
    public void makeSound() {
        System.out.println("Whoooooooo");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting in packs");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}

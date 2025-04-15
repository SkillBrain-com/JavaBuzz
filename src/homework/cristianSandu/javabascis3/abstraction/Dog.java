package homework.cristianSandu.javabascis3.abstraction;

import javabascis3.abstraction.Animal;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Whoff Whoff");
    }

    @Override
    public boolean isHungry() {
        return false;
    }
}

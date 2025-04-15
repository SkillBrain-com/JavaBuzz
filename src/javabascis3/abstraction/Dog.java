package javabascis3.abstraction;

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

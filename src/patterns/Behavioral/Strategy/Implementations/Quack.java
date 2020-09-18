package patterns.Behavioral.Strategy.Implementations;

import patterns.Behavioral.Strategy.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
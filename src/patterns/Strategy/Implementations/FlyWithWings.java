package patterns.Strategy.Implementations;

import patterns.Strategy.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}
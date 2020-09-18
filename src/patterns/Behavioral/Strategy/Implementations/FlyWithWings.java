package patterns.Behavioral.Strategy.Implementations;

import patterns.Behavioral.Strategy.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}
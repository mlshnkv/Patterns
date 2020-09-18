package patterns.Behavioral.Strategy;

import patterns.Behavioral.Strategy.Implementations.FlyWithWings;
import patterns.Behavioral.Strategy.Implementations.Quack;

public class MallardDuck extends Duck {


    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm real mallard duck");
    }
}

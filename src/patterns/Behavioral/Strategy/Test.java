package patterns.Behavioral.Strategy;

import patterns.Behavioral.Strategy.Implementations.FlyNoWay;
import patterns.Behavioral.Strategy.Implementations.MuteQuack;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck implDuck = new Duck(new FlyNoWay(), new MuteQuack()) {
            @Override
            public void display() {
                System.out.println("i'm abstract duc - i can't fly and float");
            }
        };
        implDuck.display();
        implDuck.performQuack();
        implDuck.performFly();

    }
}

package patterns.Behavioral.Strategy.Implementations;

import patterns.Behavioral.Strategy.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}

package patterns.Decorator.starbuzz.abstra;

import patterns.Decorator.starbuzz.abstra.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

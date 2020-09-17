package patterns.Decorator.starbuzz.abstra;

import patterns.Decorator.starbuzz.abstra.Beverage;
import patterns.Decorator.starbuzz.abstra.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}

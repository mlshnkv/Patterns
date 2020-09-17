package patterns.Decorator.starbuzz.abstra;

import patterns.Decorator.starbuzz.abstra.Beverage;
import patterns.Decorator.starbuzz.abstra.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .80;
    }
}

package patterns.Decorator.starbuzz.abstra;

import patterns.Decorator.starbuzz.abstra.Beverage;
import patterns.Decorator.starbuzz.abstra.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .40;
    }
}

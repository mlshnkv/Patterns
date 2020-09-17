package patterns.Decorator.starbuzz.abstra;

import patterns.Decorator.starbuzz.abstra.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

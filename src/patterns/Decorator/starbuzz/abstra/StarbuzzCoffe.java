package patterns.Decorator.starbuzz.abstra;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        print(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);
    }



    static void print(Beverage beverage){
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}

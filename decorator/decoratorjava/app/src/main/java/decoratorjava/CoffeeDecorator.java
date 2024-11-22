package decoratorjava;

public abstract class CoffeeDecorator extends Beverage {
    Beverage beverage;

    CoffeeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public void drink() {
        beverage.drink();
    }
}

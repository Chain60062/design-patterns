package decoratorjava;

public class App {
    public static void main(String[] args) {
        Beverage coffeeWithSugarAndMilk = new MilkDecorator(new SugarDecorator(new Coffee()));
        coffeeWithSugarAndMilk.drink();

        Beverage coffeeWithSugar = new SugarDecorator(new Coffee());
        coffeeWithSugar.drink();

        Beverage coffeeWithMilk = new MilkDecorator(new Coffee());
        coffeeWithMilk.drink();

        //outra forma, que demonstra o acúmulo de funções melhor
        // Beverage coffee = new Coffee();
        // coffee = new MilkDecorator(coffee);
        // coffee.drink();
    }
}

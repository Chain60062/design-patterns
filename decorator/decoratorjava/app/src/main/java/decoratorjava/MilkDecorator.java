package decoratorjava;

//esse é um decorator concreto
public class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        // comportamento padrão
        super.drink();
        // comportamento adicionado
        System.out.println("- com leite");
    }
}

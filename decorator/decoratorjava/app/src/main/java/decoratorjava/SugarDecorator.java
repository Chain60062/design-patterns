package decoratorjava;

//esse é um decorator concreto
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        // comportamento padrão
        super.drink();
        // comportamento adicionado
        System.out.println("- com açúcar");
    }
}

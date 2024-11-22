package decoratorjava;

//esta é a classe base
public class Coffee extends Beverage {

    @Override
    public void drink() {
        System.out.println("Você está bebendo: café");
    }
}

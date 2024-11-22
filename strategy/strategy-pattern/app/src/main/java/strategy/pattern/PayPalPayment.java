package strategy.pattern;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pago com PayPal.");
    }    
}

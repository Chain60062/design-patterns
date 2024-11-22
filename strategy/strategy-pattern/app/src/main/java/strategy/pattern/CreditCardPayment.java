package strategy.pattern;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Pago com cartão de crédito");
    }
    
}

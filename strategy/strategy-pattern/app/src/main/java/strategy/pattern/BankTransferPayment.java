package strategy.pattern;

public class BankTransferPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Pago com transferência bancária");
    }
}

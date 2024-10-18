package pagamento;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment(String creditCardNumber, double balance) {
        return new CreditCardPayment(creditCardNumber, balance);
    }
}

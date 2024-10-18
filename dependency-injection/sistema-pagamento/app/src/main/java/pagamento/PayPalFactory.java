package pagamento;

public class PayPalFactory extends PaymentFactory {
    @Override
    public Payment createPayment(String email, double balance) {
        return new PayPalPayment(email, balance);
    }
}

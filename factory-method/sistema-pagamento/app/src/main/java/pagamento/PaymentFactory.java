package pagamento;

public abstract class PaymentFactory {
    public abstract Payment createPayment(String identifier, double balance);
}

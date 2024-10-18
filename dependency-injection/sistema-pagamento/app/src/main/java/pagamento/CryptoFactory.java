package pagamento;

public class CryptoFactory extends PaymentFactory {
    @Override
    public Payment createPayment(String walletAddress, double balance) {
        return new CryptoPayment(walletAddress, balance);
    }
}

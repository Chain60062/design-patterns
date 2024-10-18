package pagamento;

public class CryptoPayment implements Payment {
    private String walletAddress;
    private double balanceInFiat;

    public CryptoPayment(String walletAddress, double balanceInFiat) {
        this.walletAddress = walletAddress;
        this.balanceInFiat = balanceInFiat;
    }

    @Override
    public void processPayment(double amount) {
        if (!isPaymentValid(amount)) {
            System.out.println("Saldo insuficiente");
            return;
        }

        System.out.println(
                "Pagamento realizado com sucesso, pago com crypto");
    }

    private boolean isPaymentValid(double amount) {
        return balanceInFiat > amount;
    }
}

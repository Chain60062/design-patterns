package pagamento;

public class CreditCardPayment implements Payment {
    String creditCardNumber;
    double balance;

    public CreditCardPayment(String creditCardNumber, double balance) {
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) {
        if (!isPaymentValid()) {
            System.out.println("Email não pertence a um usuário do PayPal.");
            return;
        }
        System.out.println(
                "Pagamento realizado com sucesso, pago com cartão de crédito");
    }

    private boolean isPaymentValid() {
        return creditCardNumber.length() < 10;
    }
}

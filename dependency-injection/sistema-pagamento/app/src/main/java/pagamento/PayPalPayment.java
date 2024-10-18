package pagamento;

import java.util.Arrays;
import java.util.List;

public class PayPalPayment implements Payment {
    private String email;
    private double balance;
    private List<String> paypalEmails = Arrays.asList("mock@gmail.com", "paypaluser@gmail.com");
    
    public PayPalPayment(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) {
        if (!isPaymentValid(email)) {
            System.out.println("Email não pertence a um usuário do PayPal.");
            return;
        }
        System.out.println(
                "Pagamento realizado com sucesso, pago com PayPal");
    }

    private boolean isPaymentValid(String email) {
        return paypalEmails.contains(email);
    }
}

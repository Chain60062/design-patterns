package pagamento;

public class App {
    public static void main(String[] args) {
        CryptoFactory cryptoFactory = new CryptoFactory();
        PayPalFactory paypalFactory = new PayPalFactory();
        CreditCardFactory creditFactory = new CreditCardFactory();
        
        var crypto = cryptoFactory.createPayment("0x32Be343B94f860124dC4fEe1c7B7B8B646F6D9F", 100);
        var paypal = paypalFactory.createPayment("paypaluser@gmail.com", 100);
        var credit = creditFactory.createPayment("1248172", 100);

        crypto.processPayment(120);
        paypal.processPayment(80);
        credit.processPayment(80);
    }
}

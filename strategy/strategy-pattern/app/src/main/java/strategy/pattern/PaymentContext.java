package strategy.pattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentContext() {
    }
    //AUXILIAR: chama PaymentStrategy.pay() só para encurtar chamadas de context.paymentStrategy.pay para context.pay()
    public void pay() {
        paymentStrategy.pay();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}

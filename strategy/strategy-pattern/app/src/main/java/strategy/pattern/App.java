package strategy.pattern;

import static java.lang.System.out;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean leaveProgram = false;
        PaymentContext context = new PaymentContext();



        var creditCardPayment = new CreditCardPayment();
        var payPalPayment = new PayPalPayment();
        var bankTransferPayment = new BankTransferPayment();
        
        while (!leaveProgram) {
            out.println(
                    "Digite 1 - para pagar com PayPal,\nDigite 2 - para pagar com cartão de crédito\nDigite 3 - para pagar com uma transferência bancária");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    context.setPaymentStrategy(payPalPayment);
                    break;
                case 2:
                    context.setPaymentStrategy(creditCardPayment);
                    break;
                case 3:
                    context.setPaymentStrategy(bankTransferPayment);
                    break;
                default:
                    out.println("Opção inválida, tente novamente");
                    continue;
                }

                context.pay();
                out.println("Deseja realizar outro pagamento? (s/n)");
                char continuePayingInput = scanner.next().charAt(0);
                if(continuePayingInput != 's') leaveProgram = true;
        }
    }
}

package injecaodependencia;

public class App {
        public static void main(String[] args) {
                NotificationService service = new NotificationService();

                System.out.println();
                service.sendNotification(new EmailFactory(),
                                "Bem-vindo ao nosso sistema");
                service.sendNotification(new SMSFactory(),
                                "Seu código de verificação é 1234");
                service.sendNotification(new PushFactory(),
                                "Você tem uma nova mensagem");
                service.sendNotification(new WhatsappFactory(),
                                "teste no zap");
        }
}

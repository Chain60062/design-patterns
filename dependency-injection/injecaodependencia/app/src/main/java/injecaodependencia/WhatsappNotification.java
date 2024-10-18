package injecaodependencia;

public class WhatsappNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Whatsapp: " + message);
    }
}

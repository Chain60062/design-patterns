package injecaodependencia;

public class SMSNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

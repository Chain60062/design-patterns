package injecaodependencia;

public class PushNotification implements INotification {

    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}

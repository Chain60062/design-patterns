package injecaodependencia;

public class NotificationService {
    public void sendNotification(NotificationFactory factory, String message) {
        INotification notification = factory.createNotification();
        notification.send(message);
    }
}

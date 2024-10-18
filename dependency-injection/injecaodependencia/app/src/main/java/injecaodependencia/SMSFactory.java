package injecaodependencia;

public class SMSFactory extends NotificationFactory {

    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}

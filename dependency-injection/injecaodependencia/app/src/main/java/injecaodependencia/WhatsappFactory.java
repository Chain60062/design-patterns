package injecaodependencia;

public class WhatsappFactory extends NotificationFactory {

    @Override
    public INotification createNotification() {
        return new WhatsappNotification();
    }

}

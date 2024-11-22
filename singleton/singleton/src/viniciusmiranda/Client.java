package viniciusmiranda;

public class Client {
    private String clientId;
    private String name;

    public Client(String clientId, String nome) {
        this.clientId = clientId;
        this.name = nome;
        AccountManager.getInstance().createAccount(clientId, 0.0);
    }

    public void deposit(double valor) {
        AccountManager.getInstance().deposit(clientId, valor);
    }

    public void withdraw(double valor) {
        AccountManager.getInstance().withdraw(clientId, valor);
    }

    public void checkbalance() {
        double balance = AccountManager.getInstance().checkBalance(clientId);
        System.out.println("saldo da conta de " + name + ": " + balance);
    }
}

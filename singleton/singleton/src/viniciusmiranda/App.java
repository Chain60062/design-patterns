package viniciusmiranda;

public class App {
    public static void main(String[] args) {
        Client cliente1 = new Client("CLIENTE1", "Diego");
        Client cliente2 = new Client("CLIENTE2", "Priscila");

        cliente1.deposit(1000.0);
        cliente1.checkbalance();

        cliente2.deposit(500.0);
        cliente2.withdraw(200.0);
        cliente2.checkbalance();

        AccountManager manager1 = AccountManager.getInstance();
        AccountManager manager2 = AccountManager.getInstance();

        System.out.println("manager1 e manager2 são iguais: " + (manager1 == manager2));

        System.out.println("Lista de Contas:");
        AccountManager.getInstance().listActiveAccounts();
    }
}

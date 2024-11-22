package viniciusmiranda;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private static AccountManager instance;
    private Map<String, Double> accounts = new HashMap<>();

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public void createAccount(String accountId, double initialBalance) {
        if (!accounts.containsKey(accountId)) {
            accounts.put(accountId, initialBalance);
        }
    }

    public void deposit(String accountId, double amount) {
        if (accounts.containsKey(accountId)) {
            accounts.put(accountId, accounts.get(accountId) + amount);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public void withdraw(String accountId, double amount) {
        if (accounts.containsKey(accountId)) {
            double accountBalance = accounts.get(accountId);
            
            if (accountBalance>= amount) {
                accounts.put(accountId, accountBalance - amount);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    public double checkBalance(String accountId) {
        return accounts.getOrDefault(accountId, 0.0);
    }

    public void listActiveAccounts() {
        accounts.forEach((accountId, balance) -> System.out.println("ID da Conta: " + accountId + ", Saldo: " + balance));
    }
}

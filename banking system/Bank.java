
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int accountNumberCounter;

    
    public Bank() {
        accounts = new ArrayList<>();
        accountNumberCounter = 1001; 
    }

    
    public int createAccount(String name, int age) {
        int accountNumber = accountNumberCounter++; 
        Account newAccount = new Account(accountNumber, name, age);
        accounts.add(newAccount);
        return accountNumber; 
    }

    
    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; 
    }
}

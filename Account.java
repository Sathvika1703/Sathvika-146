import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private int age;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(int accountNumber, String accountHolderName, int age) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.age = age;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, balance));
            return true;
        } else {
            return false;
        }
    }

    
    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}

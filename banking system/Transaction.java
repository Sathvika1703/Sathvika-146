
public class Transaction {
    private String type;
    private double amount;
    private double balanceAfterTransaction;

    
    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    
    public String toString() {
        return type + " of $" + amount + ", Balance after transaction: $" + balanceAfterTransaction;
    }
}

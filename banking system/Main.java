

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        while (true) {
            System.out.print("\n==Banking System==");
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: depositMoney(); break;
                case 3: withdrawMoney(); break;
                case 4: checkBalance(); break;
                case 5: viewTransactionHistory(); break;
                case 6:
                    System.out.println("Exiting...");
                    System.out.println("Thank You...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        int accountNumber = bank.createAccount(name, age);
        System.out.println("Account created successfully! Your Account Number is: " + accountNumber);
    }

    private static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            System.out.println("Your current balance is: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void viewTransactionHistory() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        Account account = bank.findAccount(accountNumber);
        if (account != null) {
            account.viewTransactions();
        } else {
            System.out.println("Account not found.");
        }
    }
}

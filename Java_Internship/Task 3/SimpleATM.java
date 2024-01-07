import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);

        while (true) {
            displayMenu();

            System.out.print("Choose an option (1: Withdraw, 2: Deposit, 3: Check Balance, 0: Exit): ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            System.out.print("Enter amount: $");
            double amount = scanner.nextDouble();

            switch (option) {
                case 1:
                    userAccount.withdraw(amount);
                    break;
                case 2:
                    userAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + userAccount.getBalance());
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n ATM Menu ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
    }
}

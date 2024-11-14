class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
        if (balance < 100) {
            System.out.println("Low Balance!");
        }
    }
}

public class Zadanie5 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Jan Kowalski", 150.0);
        BankAccount account2 = new BankAccount("654321", "Anna Nowak", 50.0);

        account1.deposit(50);
        account1.withdraw(30);
        account1.displayBalance();

        account2.deposit(100);
        account2.withdraw(200); // Should print error message
        account2.displayBalance();
    }
}

class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    protected void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Separate class to access BankAccount
class BankTest extends BankAccount {
    BankTest(double balance) {
        super(balance);
    }

    public static void main(String[] args) {
        BankTest acc = new BankTest(5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.checkBalance(); // protected, accessible in subclass
    }
}

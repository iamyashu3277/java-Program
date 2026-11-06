class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder,
                long accountNumber,
                double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful: " + amount);
        }
    }

    public void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Practical10 {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Rahul", 123456789, 10000);

        account.display();

        System.out.println("\nValid Transactions:");

        account.deposit(5000);

        account.withdraw(2000);

        System.out.println("\nInvalid Transactions:");

        account.deposit(-500);

        account.withdraw(0);

        account.withdraw(-1000);

        account.withdraw(20000);

        System.out.println("\nFinal Account Details:");

        account.display();
    }
}
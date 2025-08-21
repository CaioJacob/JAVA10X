package Challenges.FifthChallenge;

public abstract class BankAccount implements Account {

    protected double balance;
    protected AccountType accountType;

    public BankAccount(double openingBalance, AccountType accountType) {
        this.balance = openingBalance;
        this.accountType = accountType;
    }

    @Override
    public void checkBalance() {
        System.out.println(accountType + " balance: " + balance);
    }

    @Override
    public abstract void deposit(double amount);

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn of: $" + amount + " made.");
        }else{
            System.out.println("Insufficient funds.");
        }
    }
}

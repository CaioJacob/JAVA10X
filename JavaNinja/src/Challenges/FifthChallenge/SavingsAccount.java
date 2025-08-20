package Challenges.FifthChallenge;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double openingBalance) {
        super(openingBalance, AccountType.SAVINGS);
    }

    @Override
    public void deposit(double amount) {
        double netValue = amount - (amount * 0.01);
        balance += netValue;
        System.out.println(accountType + " deposit: " + amount + ". (1% rate)");
    }

}

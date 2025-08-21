package Challenges.FifthChallenge;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(double openingBalance) {
        super(openingBalance, AccountType.CURRENT);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountType + " deposit: " + amount);
    }

}

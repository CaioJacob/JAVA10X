package Challenges.FifthChallenge;

public class KonohaBank {

    public void transfer(BankAccount from, BankAccount to, double amount) {
        if (from.getBalance() >= amount) {
            from.deposit(amount);
            to.deposit(amount);
            System.out.println("Transfer of: " + amount + " from " + from.getAccountType() + " to " + to.getAccountType());
        }else{
            System.out.println("Transfer not completed. Insufficient balance.");
        }
    }

    public void transfer (CurrentAccount from, CurrentAccount to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Exclusive transfer between CURRENT accounts completed.");
        }else {
            System.out.println("Transfer not completed. Insufficient balance.");
        }
    }

}

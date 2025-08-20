package Challenges.FifthChallenge;

public class Main {
    public static void main(String[] args) {

        CurrentAccount ca = new CurrentAccount(1000);
        SavingsAccount sa = new SavingsAccount(500);

        ca.checkBalance();
        sa.checkBalance();
        System.out.println("-------------------------------------------");

        ca.deposit(200);
        System.out.println("-------------------------------------------");

        sa.deposit(200);
        System.out.println("-------------------------------------------");

        ca.checkBalance();
        System.out.println("-------------------------------------------");

        sa.checkBalance();
        System.out.println("-------------------------------------------");

        KonohaBank bank = new KonohaBank();

        bank.transfer(ca,sa,300);
        System.out.println("-------------------------------------------");

        CurrentAccount ca2 = new CurrentAccount(200);
        bank.transfer(ca,ca2,100);
        System.out.println("-------------------------------------------");

        ca.checkBalance();
        sa.checkBalance();
        ca2.checkBalance();

    }
}

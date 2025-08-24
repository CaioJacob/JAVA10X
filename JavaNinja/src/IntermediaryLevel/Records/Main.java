package IntermediaryLevel.Records;

public class Main {
    public static void main(String[] args) {


    Ninja register = new Ninja("Naruto", "naruto@email.com", 999999999);
    System.out.println("Register: " + register);
    System.out.println("Register name: " + register.getName());

    NinjaRecord recordRegister = new NinjaRecord("Joao", 1111111);
    System.out.println("Register ID: " + recordRegister.id());



    }
}

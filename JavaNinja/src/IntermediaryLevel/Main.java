package IntermediaryLevel;

public class Main {
    public static void main(String[] args) {

        // Create Naruto ninja
        Ninja Naruto = new Ninja();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Konohagakure";
        Naruto.age = 17;

        // Create Sasuke ninja, Sasuke is an OBJECT
        Ninja Sasuke = new Ninja();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Konohagakure";
        Sasuke.age = 18;

        // Applying methods to my objects
        Sasuke.ShariganActivated();
        String callingMethod = Sasuke.IAmANinja();
        System.out.println(callingMethod);
        int timeIsLeft = Sasuke.AgeToBecomeHokage(70);
        System.out.println("You are " + Sasuke.age + " years old so you have at least " + timeIsLeft + " years left to become Hokage!");

        // Create Sakura
        Ninja Sakura = new Ninja();
        Sakura.name = "Sakura Haruno";
        Sakura.village = "Konohagakure";
        Sakura.age = 18;
    }
}

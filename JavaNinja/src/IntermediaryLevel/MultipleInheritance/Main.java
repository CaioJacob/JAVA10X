package IntermediaryLevel.MultipleInheritance;

import IntermediaryLevel.Uzumaki;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konohagakure", 18);
        sasuke.shariganActivated();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Kohagakure", 48);
        kakashi.welcome();
        kakashi.shariganActivated();
        kakashi.eliteNinja();
        kakashi.hokageActivated();


    }
}
